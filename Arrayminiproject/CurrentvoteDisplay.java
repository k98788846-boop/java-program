package Arrayminiproject;

import java.util.Scanner;

public class CurrentvoteDisplay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF CANDIDATES:");
        int r = sc.nextInt();

        int votes[] = new int[r];

        System.out.println("ENTER THE NUMBER OF VOTERS:");
        int g = sc.nextInt();

        for (int i = 1; i <= g; i++) {

            System.out.println("VOTER NUMBER " + i + 
            " ENTER YOUR VOTE (1 to " + r + "):");

            int vote = sc.nextInt();

            if (vote >= 1 && vote <= r) {
                votes[vote - 1]++;
                System.out.println("VALID VOTE");
            } else {
                System.out.println("INVALID VOTE");
            }

            System.out.println("CURRENT VOTING STATUS:");
            for (int j = 0; j < r; j++) {
                System.out.println("VOTES FOR CANDIDATE " + (j + 1) + 
                " : " + votes[j]);
            }
            System.out.println("----------------------");
        }

        sc.close();
    }
}
