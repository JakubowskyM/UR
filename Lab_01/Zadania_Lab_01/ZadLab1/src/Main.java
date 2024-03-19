import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj a: ");
            int a = intIn();
        System.out.println("Podaj b: ");
            int b = intIn();
        System.out.println("Podaj c: ");
            int c = intIn();
        System.out.println("Zadanie 1: ");
            Delta(a,b,c);
        System.out.println("\n Zadanie 2:");
        int f = intIn();
        System.out.println("a(x) ");ax(f);
        System.out.println("b(x) ");bx(f);
        System.out.println("c(x) ");cx(f);

        }
    public static int intIn() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static float floatIn() {
        Scanner scanner = new Scanner(System.in);
        float liczba = scanner.nextFloat();
        return liczba;
    }
    public static void Delta(int a,int b,int c) {

        double D=(Math.pow(b,2))-(4*a*c);
        if(D>0)
        {
            double x1=(-b-D)/2*a;
            double x2=(-b+D)/2*a;
            System.out.println("Są dwa miejsca zerowe x1= "+x1 +" x2= "+x2);
        }
        else if (D==0) {
            double x=-b/2*a;
            System.out.println("Jedno miejsce zerowe "+x);
        }
        else {
            System.out.println("Nie ma miejsc zerowych");
        }
    }
    public static void ax(float x) {
        if(x>0) {
            System.out.println(2*x);
        }
        else if (x==0) {
            System.out.println(0);
        }
        else {
            System.out.println(-3*x);
        }
    }
    public static void bx(float x) {
        if(x>=1) {
            double c =Math.pow(x,2);
            System.out.println(c);
        }

        else {
            System.out.println(x);
        }
    }
    public static void cx(float x) {
        if(x>2) {
            System.out.println(2+x);
        }
        else if (x==2) {
            System.out.println(8);
        }
        else {
            System.out.println(x-4);
        }
    }

    }
