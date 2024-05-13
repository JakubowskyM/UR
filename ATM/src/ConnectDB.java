import java.sql.*;
import java.util.Scanner;

public class ConnectDB {

    private final String URL="jdbc:mysql://localhost:3306/atm";
    private final String USER="root";
    private final String PASSWORD="";
    private boolean logIn=false;
    private int id;

    public void setLogIn(boolean logIn) {
        this.logIn = logIn;
    }

    public void setId(int x){this.id=x;};

    public boolean isLogIn() {
        return logIn;
    }

    private void updateBalance(int ile){}

    protected void logToATM(String login, int pin) {
        try {
            int x;
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String qr = "SELECT Login, Password FROM users WHERE login = ? AND password = ?";

            try(PreparedStatement stmt = connection.prepareStatement(qr)) {
                stmt.setString(1,login);
                stmt.setInt(2,pin);
                try(ResultSet rs = stmt.executeQuery()) {
                    while(rs.next()) {
                        setLogIn(true);
                        setId(rs.getInt("users.Id"));
                        while(logIn) {
                            int id=1;
                            System.out.println(id);
                            System.out.println("Wybierz co chcesz zrobic: ");
                            System.out.println("1.Wyswietl balans.");
                            System.out.println("2.Wplac pieniadze.");
                            System.out.println("3.Wyplac pieniadze.");
                            System.out.println("4.Wyjdz.");
                            Scanner n = new Scanner(System.in);

                                x = n.nextInt();
                                switch (x) {
                                    case 1:
                                        String balans = "SELECT Stan FROM account WHERE account.Id_k = ?";
                                        PreparedStatement bv = connection.prepareStatement(balans);
                                        bv.setInt(1,id);
                                        ResultSet bvs = bv.executeQuery();
                                        while (bvs.next()) {
                                            System.out.println("Twoj balans to: " + bvs.getInt("Stan"));
                                            }

                                        break;
                                    case 2:

                                        System.out.println("Ile chcesz wplacic? (wpisz 0, zeby nic nie wplacac)");
                                        int ile = n.nextInt();
                                        if(ile==0)
                                            break;
                                        else {
                                            String wplac = "UPDATE account SET Stan=Stan+? WHERE account.Id_k=?";

                                            PreparedStatement wpl = connection.prepareStatement(wplac);
                                            wpl.setInt(1,ile);
                                            wpl.setInt(2,id);
                                            wpl.executeUpdate();
                                            System.out.println("Wplacono");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Ile chcesz wyplacic? (wpisz 0, zeby nic nie wyplacac)");
                                        int ilewyplaty = n.nextInt();
                                        if(ilewyplaty==0)
                                            break;
                                        else {
                                            String wplac = "UPDATE account SET Stan=Stan-? WHERE account.Id_k=?";
                                            PreparedStatement wypl = connection.prepareStatement(wplac);
                                            wypl.setInt(1,ilewyplaty);
                                            wypl.setInt(2,id);
                                            wypl.executeUpdate();
                                            System.out.println("Wyplacono");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Do widzenia.");
                                        return;
                                    default:
                                        System.out.println("Podaj poprawna opcje");

                                }
                            }

                        System.out.println("Zalogowano");
                    }
                    if(!isLogIn()) System.out.println("Niepoprawne dane");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
