public class Users extends ConnectDB {

    private String Login;
    private int Password;
    private boolean administrator=false;
    public void Polacz(String login, int Password)
    {
        setLogin(login);
        setPassword(Password);
        logToATM(getLogin(),getPassword());
    }

    public void setPassword(int password) {
        Password = password;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getLogin() {
        return Login;
    }

    public int getPassword() {
        return Password;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }
}
