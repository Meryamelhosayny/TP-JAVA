mport java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de termes : ");
        int k = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Suite de Fibonacci : " + a + " " + b + " ");
        for (int i = 2; i < k; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        sc.close();
    }
}
