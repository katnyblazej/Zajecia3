import java.sql.SQLOutput;
import java.util.Scanner;

public class Programy {

    public static void zad1_2(int n) {
        int suma = 0, i;
        for (i = 1; i <= n; i++)
            suma += i;
        System.out.println("Suma for: " + suma);
        suma = 0;
        i = 1;
        while (i <= n) {
            suma += i;
            i++;
        }
        System.out.println("Suma while: " + suma);
    }

    public static void zad3(int n) {
        int suma = 0, i;
        if (n % 2 == 0) {
            for (i = 2; i <= n; i += 2)
                suma += i;

            System.out.println("Suma for: " + suma);
            suma = 0;
            i = 2;
            while (i <= n) {
                suma += i;
                i += 2;
            }
            System.out.println("Suma while: " + suma);
        } else {
            for (i = 1; i <= n; i += 2)
                suma += i;

            System.out.println("Suma for: " + suma);
            suma = 0;
            i = 1;
            while (i <= n) {
                suma += i;
                i += 2;
            }
            System.out.println("Suma while: " + suma);
        }
    }

    public static void zad4(int n) {
        long wynik;
        wynik = (long) Math.pow(2, n);
        System.out.println("2^" + n + " = " + wynik);
    }

    public static void zad5(int n) {
        double wartosc = 1;
        for (double i = 2.0; i <= n; i++) {
            wartosc += (1 / i);
        }
        System.out.println("Wartosc " + n + "-tej liczby harmonicznej: " + wartosc);
    }

    public static void zad6(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += (1 / (Math.pow(i, 2)));
            System.out.println("Suma: " + suma);

        }
        System.out.println("Suma: " + suma);

    }

    public static void zad7() {
        for (int i = 0; i <= 4; i++) {
            for (int n = 16; n <= 2048; n *= 2) {
                if (i == 0)
                    System.out.println("Log " + n + " = " + Math.log10(n));
                else if (i == 1)
                    System.out.println("n=" + n);
                else if (i == 2)
                    System.out.println(n + " * Log_e " + n + " = " + n * Math.log(n));
                else if (i == 3)
                    System.out.println(n + "^2 =" + Math.pow(n, 2));
                else if (i == 4)
                    System.out.println(n + "^3 =" + Math.pow(n, 3));


            }
        }

    }

    public static void zad8() {

        int[][] tablica = new int[4][8];

        for (int i = 0; i <= 2; i += 2)
            for (int j = 0; j < 8; j += 2) {
                tablica[i][j] = 1;
                tablica[i][j + 1] = 0;
            }

        for (int i = 1; i <= 3; i += 2) {
            for (int j = 0; j < 8; j += 2) {
                tablica[i][j] = 0;
                tablica[i][j + 1] = 1;
            }
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
    }


    public static void zad9() {
        char znakGwiazdki = '*';
        Scanner podaj = new Scanner(System.in);

        System.out.print("Podaj ilosc poziomow choinki: ");
        int poziomy = podaj.nextInt();

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy * 2; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();

        }
    }


    public static void zad10() {
        int[] tablica = new int[10];
        int suma = 0, mnoznik = 10, kontrolna;
        Scanner podaj = new Scanner(System.in);
        System.out.println("Podaj 9 cyfr z rzedu: ");
        for (int i = 0; i < 9; i++) {
            tablica[i] = podaj.nextInt();
            suma += tablica[i] * mnoznik;
            mnoznik--;
        }
        kontrolna = 11 - suma % 11;
        tablica[9] = kontrolna;

        System.out.println("Suma kontrona: " + kontrolna + " Numer ISBN: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tablica[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner podaj = new Scanner(System.in);
        int n;

        zad1_2(100);
        System.out.println("Podaj n do zsumowania(zad2): ");
        n = podaj.nextInt();
        zad1_2(n);
        System.out.println("Podaj n do zsumowania(zad3): ");
        n = podaj.nextInt();
        zad3(n);
        System.out.println("Podaj potege n(zad4): ");
        n = podaj.nextInt();
        zad4(n);
        System.out.println("Podaj n-ty stopien liczby harmonicznej(zad5): ");
        n = podaj.nextInt();
        zad5(n);
        System.out.println("Podaj n do zsumowania(zad6): ");
        n = podaj.nextInt();
        zad6(n);
        System.out.println("Zad7");
        zad7();
        System.out.println("Zad8");
        zad8();
        System.out.println("Zad9");
        zad9();
        System.out.println("Zad10");
        zad10();


    }

}


