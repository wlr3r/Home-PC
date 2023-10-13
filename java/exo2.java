import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer un chiffre : ");
        try (Scanner sc = new Scanner(System.in)) {
            int nb = sc.nextInt();

            while (nb != 9) {
                if (nb < 9) {
                    System.out.println("Le chiffre est en dessous de 9 donc exacte : ");
                } else {
                    System.out.println("Le chiffre est au dessus de 9 donc FAUX1 : ");
                }

                nb = sc.nextInt();
            }
        }
        System.out.println("Bravo, vous avez deviné le chiffre 9 !");
    }
}
