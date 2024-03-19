import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
        int a = IntIn();
        System.out.println("Podaj b: ");
        int b = IntIn();
        zadanie2(a, b);
        System.out.println("Podaj c (czy parzysta): ");
        int c = IntIn();
        System.out.println("Zadanie 3 "+czyPara(c));
        System.out.println("Podaj d (czy dzieli sie przez 3 i 5): ");
        int d = IntIn();
        System.out.println("Zadanie 4 "+czyDzieli5_i_3(d));
        System.out.println("Podaj e (liczbe do potegi 3): ");
        int e = IntIn();
        System.out.println("Zadanie 5 "+pow3(e));
        System.out.println("Podaj f (pierwiastek kwadratowy z tej liczby: ");
        int f = IntIn();
        System.out.println("Zadanie 6 "+sqrt2(f));
        System.out.println("Podaj g i h (zakres losowania liczb): ");
        int g = IntIn();
        int h = IntIn();
        System.out.println("Zadanie 7  "+Trojkat(los(g,h),los(g,h),los(g,h)));
    }

    //koniec main
    public static void zadanie2(int a, int b) {
        System.out.println("Suma: " + a + " + " + b + " = " + (a + b));
        System.out.println("Różnica: " + a + " - " + b + " = " + (a - b));
        System.out.println("Iloczyn: " + a + " / " + b + " = " + (a / b));

    }

    //koniec zadania2
    public static int IntIn() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    //koniec metody pozwalającej na wprowadzenie do programu liczb od uzytkownika
    public static boolean czyPara(int a) {

        if (a % 2 == 0) return true;
        else return false;

    }
    //koniec metody sprawdzajacej czy liczba jest parzysta

    public static boolean czyDzieli5_i_3(int a) {

        if(a%3==0 && (a%5)==0)
            return true;
        else return false;
    }
    public static int pow3(int a) {
        return (int) Math.pow(a,3);
    }
    public static float sqrt2(int a) { return (int) Math.sqrt(a);}
    public static int los (int a,int b) {
        Random random=new Random();
        int liczba = random.nextInt(b+a+1)+a;
        System.out.println(liczba);
        return liczba;
    }
    public static boolean Trojkat (int a, int b, int c) {
        if((a+b)>c || (b+c)>a || (c+a)>b)
            return true;
        else return false;
    }
}