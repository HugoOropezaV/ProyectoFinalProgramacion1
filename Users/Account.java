import java.util.HashMap;

public class Account {

    private static int accounts = 1000;
    private int id;
    private String password;
    private IDandPasswords iDandPasswords;
    private boolean logged;
    
    Account( String password) {
        this.id = accounts;
        this.logged = false;
        this.password = password;
        accounts += 1;
    }
    //private AccountStatus status;

    public boolean resetPassword(String password){
        this.password = password;
        return true;
    }

    public int getId() {
        return id;
    }


    public String getPassword() {
        return password;
    }

    public void isLogged(boolean b) {
        this.logged = true;
    }

    public boolean getLogged(){
        return this.logged;
    }

    public String toStirng(){
        return "ID: " + getId() + "\nPass: " + getPassword();
    }
}

