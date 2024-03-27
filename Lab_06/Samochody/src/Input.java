import java.util.Scanner;

public class Input {

    Scanner input = new Scanner(System.in);
    public int InputInt() {
        int liczbaInt = input.nextInt();
        return liczbaInt;
    }
    public double InputDb() {

        double liczbaDb = input.nextDouble();
        return liczbaDb;
    }
    public String InputC() {
        String znak = input.next();
        return znak;
    }

}
