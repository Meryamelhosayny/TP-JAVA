import java.util.Scanner;

public class BaremeNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une note sur 20 : ");
        double note = sc.nextDouble();

        if (note >= 16)
            System.out.println("Mention : A");
        else if (note >= 14)
            System.out.println("Mention : B");
        else if (note >= 12)
            System.out.println("Mention : C");
        else if (note >= 10)
            System.out.println("Mention : D");
        else
            System.out.println("Mention : F");

        sc.close();
    }
}
