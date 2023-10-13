import java.util.Scanner;


public class exo1{
    public static void main(String[] args) {
        System.out.println("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int i = 0;
        int somme = 0;
        while (i <= nb) {
            somme = somme + i;
            i++;
        }
        System.out.println("La somme des entiers de 1 à " + nb + " est " + somme);
    
    }
}
    