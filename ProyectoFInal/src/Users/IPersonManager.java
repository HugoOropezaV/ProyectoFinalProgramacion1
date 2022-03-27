package  Users;
import java.util.ArrayList;

public interface IPersonManager {

    ArrayList<Person> users = new ArrayList<Person>();
    IDandPasswords iDandPasswords = new IDandPasswords();


    public ArrayList<Person> getUsers();

    public IDandPasswords getiDandPasswords();


    public void addUser(Person person);

}
