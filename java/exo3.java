import java.util.Scanner;

public class exo3 {
    public static void main(String[] args){
        System.out.println("Veuillez saisir 2 nombres : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (y < 0){
            System.out.println("la puissance ne peut pas être négatif");
        } else{
            int resultat = 1;

            for (int i = 0; i <y ; i++){
                resultat *= x;
            }
            System.out.println("Le résultat de" + " " + x + " " + "^"+  " " + y + " " + "ç'est de : " + resultat);
        }
    }
}