import java.util.Scanner;

public class Main {
    public static void topla(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void cikar(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void carp(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static void bol(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Sayı 0 a bölünmez.");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }

    public static void mod(int a, int b) {
        if (b == 0) {
            System.out.println("Error: 0 ile mod alınmaz.");
        } else {
            System.out.println(a + " mod " + b + " = " + (a % b));
        }
    }

    public static int fact(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Error: Faktöriyelde negatif sayılar kullanılmaz.");
        }
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * fact(a - 1);
    }

    public static void factyaz(int a, int b) {
        try {
            System.out.println("Factorial of " + a + " = " + fact(a));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Factorial of " + b + " = " + fact(b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test() {
        System.out.println("Basic Unit Tests Starting...");
        topla(3, 2);
        cikar(3, 2);
        carp(3, 2);
        bol(3, 2);
        bol(3, 0); // bölü 0 testi
        mod(3, 2);
        mod(3, 0); // mod 0 testi
        factyaz(5, -1); // negatif fact testi
        System.out.println("Unit Tests Completed.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("OPERATIONS:");
        topla(a, b);
        cikar(a, b);
        carp(a, b);
        bol(a, b);
        mod(a, b);
        factyaz(a, b);

        // Run Unit Tests
        test();
    }
}
