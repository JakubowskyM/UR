import java.sql.*;

public class ConnectDB {

    private final String URL="jdbc:mysql://localhost:3306/atm";
    private final String USER="root";
    private final String PASSWORD="";
    private boolean logIn=false;

    public void setLogIn(boolean logIn) {
        this.logIn = logIn;
    }

    public boolean isLogIn() {
        return logIn;
    }

    public void logToATM(String login, int pin) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String qr = "SELECT Login, Password FROM users WHERE login = ? AND password = ?";
            try(PreparedStatement stmt = connection.prepareStatement(qr)) {
                stmt.setString(1,login);
                stmt.setInt(2,pin);
                try(ResultSet rs = stmt.executeQuery()) {
                    while(rs.next()) {
                        setLogIn(true);
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
