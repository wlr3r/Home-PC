import java.util.Random;
import java.util.Scanner;

public class justePrix {
    public static void main(String[] args) {
        Random rand = new Random();
        int nbrDeviner = rand.nextInt(40001) + 10000;
        int nbrEssaie = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Devinez le nombre entre 10000 et 50000:");
            while (true) {
                String guess = sc.next();
                if (guess.equalsIgnoreCase("X")) {
                    System.out.println(nbrDeviner);
                } else {
                    try {
                        int guessInt = Integer.parseInt(guess);
                        if (guessInt < 10000 || guessInt > 50000) {
                            System.out.println("Le nombre doit être entre 10000 et 50000.");
                        } else {
                            nbrEssaie++;
                            if (guessInt < nbrDeviner) {
                                System.out.println("Plus grand!");
                            } else if (guessInt > nbrDeviner) {
                                System.out.println("Plus petit!");
                            } else {
                                System.out.println("Bravo, vous avez deviné le nombre en " + nbrEssaie + " essais!");
                                break;
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Dommage");
                    }
                }
            }
        }
    }
}