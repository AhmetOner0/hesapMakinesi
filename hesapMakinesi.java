package patikadev;

import java.util.Scanner;

public class hesapMakinesi {
    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("bölen 0 olamaz!");
        }
        return a / b;
    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    static int fac(int a) {
        int result = 1;
        for (int i = 1; i < a; i++) {
            result = result * i;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int rectangle(int a, int b) {
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("dikdörtgenin alanı:" + area);
        System.out.println("dikdörtgenin çevresi:" );
        return perimeter;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, result, select;
        System.out.println("ilk sayıyı giriniz:");
        a = inp.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        b = inp.nextInt();
        String menu = "1-toplama\n" +
                "2-çıkarma\n" +
                "3-çarpma\n" +
                "4-bölme\n" +
                "5-üslü sayı hesaplama\n" +
                "6-faktöriyel hesaplama\n" +
                "7-mod alma\n" +
                "8-dikdörtgen alan ve çevre hesabı\n" +
                "9-çıkış";
        do {
            System.out.println(menu);
            System.out.println("lütfen bir işlem seçiniz");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println(sum(a,b));
                    break;
                case 2:
                    System.out.println(minus(a,b));
                    break;
                case 3:
                    System.out.println(times(a,b));
                    break;
                case 4:
                    System.out.println(divided(a,b));
                    break;
                case 5:
                    System.out.println(pow(a,b));
                    break;
                case 6:
                    System.out.println(fac(a));
                    break;
                case 7:
                    System.out.println(mod(a,b));
                    break;
                case 8:
                    System.out.println(rectangle(a,b));
                    break;
                case 9:
                    break;
                default:
                    System.out.println("yanlış değer girdiniz!");
            }
        }while (select != 9);
        }
    }


