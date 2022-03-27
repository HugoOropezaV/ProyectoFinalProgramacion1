package  Users;

public class Utils {

    public static boolean isValidPassword(String password){
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 8)
        {
            System.out.println("Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have at least one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password must have at least one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at  least one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password must have at least one special character among @#$%");
            isValid = false;
        }
        return isValid;
    }

    public static String passwordCipher(String password){
        return "";
    }

    public static boolean emailValidator(String email){
        return true;
    }

    public static boolean isValidPhone(int phone){
        if(String.valueOf(phone).length() == 8){
            if(String.valueOf(phone).charAt(0) == 7 || String.valueOf(phone).charAt(0) == 6){
                return true;
            }
            return false;
        }
        return false;
    }

    public static String passwordGenerator(){
        return "";
    }


}
