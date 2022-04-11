package explore_java.ticTacToe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class playGame {

        // @Override
    public void playTicTacToe() {
        // TODO get name of both player and store in player oobject
        Scanner sc = new Scanner(System.in);
        TicTacToe t3 = new TicTacToe();

        System.out.println("Enter name of player 1: ");
        String name1 = sc.nextLine();  
        System.out.println("Enter name of player 2: ");
        String name2 = sc.nextLine();

        Player player1 = new Player( name1,0);
        Player player2 = new Player( name2,1);
        
        int isRunning = -1;

        t3.initializeState();

        // players list
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        int turn = 0;
        while(isRunning == -1){

           


            Player player = players.get(turn);
            System.out.println("Player " + player.getName() + " turn");
            // System.out.println("Player {} chance",players.get(turn).getName());
            System.out.println("Enter row and column");
            int row = sc.nextInt();
            int column = sc.nextInt();
             //  clear the terminal
             System.out.print("\033[H\033[2J");
             System.out.flush();

            Move move = new Move(row, column);
            try{
            t3.playChance(player, move);
            t3.displayState();
            
            isRunning = t3.calculate(t3.state, player.getIndex());
            t3.displayResult(players,isRunning);
            turn = (turn + 1)%2;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }   
            
        }
        // thanks message
        System.out.println("Thanks for playing");
        
    }

    public static void main(String[] args) {
        playGame p = new playGame();
        p.playTicTacToe();
    }

}
