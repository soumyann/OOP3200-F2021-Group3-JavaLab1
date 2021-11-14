package ca.durhamcollege;
import com.sun.jdi.request.ExceptionRequest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static String PLAYER_1 = "Soumya";
    private static String PLAYER_2 = "Shweta";
    private static String PLAYER_3 = "Tom";

    public static void main(String[] args)
    {
        String game[][] = new String[3][3];
        game[0][0] = PLAYER_1;
        game[1][0] = PLAYER_2;
        game[2][0] = PLAYER_3;

        Scanner myObj = new Scanner(System.in); // Creating Scanner object
        for (int i=0; i<3;i++)
        {
            String scoreOne = null;
            String scoreTwo = null;

            while (scoreOne==null)
            {
                System.out.printf("Please enter " + game[i][0] + "'s Score #1: ");
                scoreOne = myObj.nextLine();
                try{
                    int temp = Integer.parseInt(scoreOne);
                    if(!(temp>=0 && temp <=300)) {
                        System.out.println("Invalid input. Value between 0 and 300 needed. Please try again");
                        scoreOne = null;
                    }
                }
                catch (NumberFormatException ex){
                    System.out.println("Invalid input. Numeric value needed. Please try again");
                    scoreOne = null;
                }
            }
            game[i][1] = scoreOne;


            while (scoreTwo==null)
            {

                System.out.printf("Please enter "+ game[i][0]+"'s Score #2: ");
                scoreTwo = myObj.nextLine();
                try{
                    int temp = Integer.parseInt(scoreTwo);
                    if(!(temp>=0 && temp <=300)) {
                        System.out.println("Invalid input. Value between 0 and 300 needed. Please try again");
                        scoreTwo = null;
                    }
                }
                catch (NumberFormatException ex){
                    System.out.println("Invalid input. Numeric value needed. Please try again");
                    scoreTwo = null;
                }
            }
            game[i][2]=scoreTwo;

            System.out.println("-------------------------------------------------");
        }


    }
}
