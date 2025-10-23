import java.util.Scanner;

public class TypeTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le cote a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez le cote b : ");
        double b = sc.nextDouble();
        System.out.print("Entrez le cote c : ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("Le triangle est equilateral.");
            else if (a == b || a == c || b == c)
                System.out.println("Le triangle est isocele.");
            else
                System.out.println("Le triangle est scalene.");
        } else {
            System.out.println("Les cotes ne forment pas un triangle valide.");
        }

        sc.close();
    }
}

