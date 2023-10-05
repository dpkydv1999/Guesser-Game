import java.util.Scanner;

class Guesser{
    int Guessernum;

    public int takeNumberGuesser(){
        System.out.println("Guesser guess a number: ");
        Scanner scan = new Scanner(System.in);
        Guessernum = scan.nextInt();
        return Guessernum;
    }
}
class Player{
     int Playernum;

    public int takeNumberPlayer(){
        System.out.println("Player guess a number: ");
        Scanner scan = new Scanner(System.in);
        Playernum = scan.nextInt();
        return Playernum;
    }

}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.takeNumberGuesser();
    }
    void CollectFromPlayer(){
        Player p1 = new Player();
        numFromPlayer1 = p1.takeNumberPlayer();

        Player p2 = new Player();
        numFromPlayer2 = p2.takeNumberPlayer();

        Player p3 = new Player();
        numFromPlayer3 = p3.takeNumberPlayer();

    }
    void Compare(){
        if(numFromPlayer1==numFromGuesser){
            if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser){
                System.out.println("All players won the game.");
            }
            else if(numFromPlayer2==numFromGuesser){
                System.out.println("Only Player 1 and Player 2 won the game");
            }
            else if(numFromPlayer3==numFromGuesser){
                System.out.println("Only Player 1 and Player 3 won the game.");
            }
            else{
                System.out.println("Only Player 1 won the game.");
            }
        }
        else if(numFromPlayer2 == numFromGuesser){
            if(numFromPlayer3 == numFromGuesser){
                System.out.println("Only Player 2 and Player 3 won the game.");
            }
            else{
                System.out.println("Only Player 2 won the game.");
            }
            
        }
        else if(numFromPlayer3 == numFromGuesser){
            System.out.println("Only Player 3 won the game.");
        }
        else{
            System.out.println("No Player won the game.");
        }
    }

}

public class GuesserGame{
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.CollectFromGuesser();
        u.CollectFromPlayer();
        u.Compare();
    }

}