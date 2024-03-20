import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = intIn();
        int suma=0; int k;
            for(int i=1;i<=n;i++) {
                System.out.println("Podaj punkty studenta nr: "+i);
                k=intIn();
                suma+=k;
            }
            float srednia=suma/n;
        System.out.println(srednia);
    }
    public static int intIn() {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

}