package  Users;
import java.util.ArrayList;

public interface IPersonManager {

    ArrayList<Customer> users = new ArrayList<Customer>();
    public ArrayList<Customer> getUsers();

    public String getAllUsers();

    public void blockUser(Customer person);

    public void blockUser(int i, boolean block);


}
