import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une annee : ");
        int annee = sc.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0))
            System.out.println(annee + " est une annee bissextile.");
        else
            System.out.println(annee + " n'est pas une annee bissextile.");

        sc.close();
    }
}
