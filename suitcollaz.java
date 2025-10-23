import java.util.Scanner;

public class SuiteCollatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        int etapes = 0;

        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
            etapes++;
            System.out.println("Étape " + etapes + " → n = " + n);
        }

        System.out.println("Nombre total d’étapes : " + etapes);
        sc.close();
    }
}
