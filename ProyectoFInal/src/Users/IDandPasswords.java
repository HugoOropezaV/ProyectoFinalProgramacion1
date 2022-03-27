package  Users;
import java.util.HashMap;

public class IDandPasswords {

    HashMap<Integer, String> loginInfo;
    
    IDandPasswords(){
        loginInfo= new HashMap<Integer,String>();
    }

    public void add(int id, String password){
        loginInfo.put(id, password);
    }
    public  HashMap<Integer, String> getLoginInfo() {
        return loginInfo;
    }

    public void add(Account account) {
        this.loginInfo.put(account.getId(), account.getPassword());
    }

}
