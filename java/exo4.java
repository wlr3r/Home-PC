import java.util.Scanner;

public class exo4 {
    public static void main(String[] args){
        System.out.println("Veuillez introduire un nombre !");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= nb; i++){
            factorial = factorial * i;
        }
        System.out.println("Le factoriel de " + nb + " est " + factorial);
        
        
    }
}
