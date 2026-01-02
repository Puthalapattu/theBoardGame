package tictoc.helpers;

import java.util.InputMismatchException;
import java.util.Scanner;

import tictoc.utils.Player;

public class PlayerRegHelper {

    public final void displayInitialPlayersInfo(Player[] players, String reset, String[] colors) {

        System.out.printf("%sRed%s = %s\n", colors[0], reset, players[0].getName());
        System.out.printf("%sGreen%s = %s\n\n", colors[1], reset, players[1].getName());

    }

    public String readPlayerName(Scanner input) {
        String playerName = "";

        try {
            playerName = input.nextLine().toUpperCase();

        } catch (InputMismatchException e) {
            System.out.println("\nPlayer name can only be a String, try again\n");

        } catch (Exception e) {
            System.out.println("Currently handling players registration");
            System.out.println("and.. error occured: " + e.getLocalizedMessage());

        }

        return playerName;
    }
}
