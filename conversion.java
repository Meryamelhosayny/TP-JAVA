import java.util.Scanner;

public class ConversionTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la temperature en Celsius : ");
        double c = sc.nextDouble();
        double f = c * 9 / 5 + 32;
        System.out.println("Temperature en Fahrenheit : " + f);
        sc.close();
    }
}

