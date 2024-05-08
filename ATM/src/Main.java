import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println("Podaj swoj login: ");
        String login = n.nextLine();
        System.out.println("Podaj swoj pin (4 cyfry): ");
        int pin = n.nextInt();

        ConnectDB log = new ConnectDB();
        log.logToATM(login,pin);

    }
}