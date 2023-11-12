import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Int;
        double Double;
        char Char;
        boolean w_Boolean;

        System.out.print("Podaj wartość int: ");
        Int = scanner.nextInt();
        System.out.print("Podaj wartość double: ");
        Double = scanner.nextDouble();
        System.out.print("Podaj znak char: ");
        Char = scanner.next().charAt(0);
        System.out.print("Podaj wartość boolean: ");
        w_Boolean = scanner.nextBoolean();

        int DoubleNaInt = (int) Double;
        double IntNaDouble = (double) Int;
        int CharNaInt = (int) Char;
        String BooleanNaString = Boolean.toString(w_Boolean);

        System.out.println("Konwersja z double na int: " + DoubleNaInt);
        System.out.println("Konwersja z int na double: " + IntNaDouble);
        System.out.println("Konwersja z char na int: " + CharNaInt);
        System.out.println("Konwersja z boolean na string: " + BooleanNaString);

        scanner.close();
    }
}