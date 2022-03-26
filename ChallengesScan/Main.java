package ChallengesScan;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ejemplo

        int i = 0;

        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("What are you?" +
                    "\n 1. Admin" +
                    "\n 2. Usuario");
            int option = scan.nextInt();
            if (option == 1) {
                addsScan.challengeControlAd();
            } else if (option == 2) {
                addsScan.challengeControlus();
            } else {
                System.out.println("Pls, select a valid option");
            }

        }while(i < 1);

    }
}
