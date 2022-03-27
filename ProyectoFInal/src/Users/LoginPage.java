package  Users;
import java.util.HashMap;

public class LoginPage {

    HashMap<Integer, String> loginInfo;
    LoginPage(){
        this.loginInfo = new HashMap<Integer, String>();
    }
    LoginPage(HashMap<Integer, String> loginInfo){
        this.loginInfo = loginInfo;
    }

    public boolean login(int ID, String password){
        if(loginInfo.containsKey(ID)){
            if(loginInfo.get(ID).equals(password)){
                return true;
            }
            return false;
        }
        return false;
    }
    public boolean login(Account account){
        if(loginInfo.containsKey(account.getId())){
            if(loginInfo.get(account.getId()).equals(account.getPassword())){
                account.isLogged(true);
                return true;
            }
            return false;
        }
        return false;
    }
/* CAMILO SAMUEL GUZMAN
    CRISTIAN JOEL GUZMAN
*
* */

    
}
