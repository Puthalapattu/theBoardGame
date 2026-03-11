package tictoc.helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

import tictoc.utils.Player;

public class PlayerRegHelper {

    public final void displayInitialPlayersInfo(Player[] players, String[] colors) {
        String reset = colors[0];

        System.out.printf("%sRed%s = %s\n", colors[1], reset, players[0].getName());
        System.out.printf("%sGreen%s = %s\n\n", colors[2], reset, players[1].getName());

    }

    public final String readPlayerName(Scanner input, int id) {
        String playerName = "";

        try {

            while (true) {
                System.out.printf("Name of Player-%d: ",  id);
                playerName = input.nextLine().toUpperCase();

                if (playerName.length() == 1) {
                    System.out.println("Given name isn't valid, name length should be > 1");
                
                } else {
                    break;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("\nPlayer name can only be a String, try again\n");

        } catch (Exception e) {
            System.out.println("Currently handling players registration");
            System.out.println("and.. error occured: " + e.getLocalizedMessage());

        }

        return playerName;
    }
}
