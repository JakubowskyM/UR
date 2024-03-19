import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        int a = intIn();
        int b = intIn();
        int c = intIn();
        Delta(a,b,c);
        }
    public static int intIn() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static void Delta(int a,int b,int c) {

        float D=(b^2)-(4*a*c);
        if(D>0)
        {
            float x1=(-b-D)/2*a;
            float x2=(-b+D)/2*a;
            System.out.println("Są dwa miejsca zerowe x1= "+x1 +" x2= "+x2);
        }
        else if (D==0) {
            float x=-b/2*a;
            System.out.println("Jedno miejsce zerowe "+x);
        }
        else {
            System.out.println("Nie ma miejsc zerowych");
        }
    }
    }
