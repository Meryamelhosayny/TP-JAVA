import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();

        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i;
        }
        System.out.println("Somme avec for : " + somme);

        int somme2 = 0;
        int i = 1;
        while (i <= n) {
            somme2 += i;
            i++;
        }
        System.out.println("Somme avec while : " + somme2);

        sc.close();
    }
}
