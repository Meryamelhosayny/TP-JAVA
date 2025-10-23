import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        
        if (n % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
        
        sc.close();
    }
}
