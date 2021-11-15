package ca.durhamcollege;
import com.sun.jdi.request.ExceptionRequest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static String PLAYER_1 = "Soumya";
    private static String PLAYER_2 = "Shweta";
    private static String PLAYER_3 = "Tom";

    private static String getScore(String name, int scoreNo)
    {
        Scanner myObj = new Scanner(System.in); // Creating Scanner object
        String score = null;
        while (score==null)
        {
            System.out.printf("Please enter " + name + "'s Score #"+scoreNo+": ");
            score = myObj.nextLine();
            try{
                int temp = Integer.parseInt(score);
                if(!(temp>=0 && temp <=300)) {
                    System.out.println("Invalid input. Value between 0 and 300 needed. Please try again");
                    score = null;
                }
            }
            catch (NumberFormatException ex){
                System.out.println("Invalid input. Numeric value needed. Please try again");
                score = null;
            }
        }
        return score;
    }

    public static void main(String[] args)
    {
        String game[][] = new String[3][3];
        game[0][0] = PLAYER_1;
        game[1][0] = PLAYER_2;
        game[2][0] = PLAYER_3;

        for (int i=0; i<3;i++)
        {
            game[i][1] = getScore(game[i][0], 1);
            game[i][2] = getScore(game[i][0], 2);

            System.out.println("-------------------------------------------------");
        }
        for (int i=0; i<3; i++)
        {
            System.out.println("Score details for "+game[i][0] + ":");
            System.out.println("Game #1: "+ game[i][1]);
            System.out.println("Game #2: "+ game[i][2]);
            float avg= (Float.parseFloat(game[i][1])+Float.parseFloat(game[i][2]))/2;
            System.out.println("Average for "+ game[i][0]+": "+String.format("%.1f",avg));
            System.out.println("-------------------------------------------------");
        }


    }
}
