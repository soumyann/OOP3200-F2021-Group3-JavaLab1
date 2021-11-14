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

            System.out.printf("Please enter "+ game[i][0]+"'s Score #1: ");
            scoreOne = myObj.nextLine();
            game[i][1]=scoreOne;

            System.out.printf("Please enter "+ game[i][0]+"'s Score #2: ");
            scoreTwo = myObj.nextLine();
            game[i][2]=scoreTwo;

            System.out.println("-------------------------------------------------");
        }


    }
}
