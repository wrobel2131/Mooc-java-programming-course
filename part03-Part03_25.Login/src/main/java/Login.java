
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";
        
        String usernameInput = scanner.nextLine();
        String passwordInput = scanner.nextLine();
        
        if((usernameInput.equals(username1) && passwordInput.equals(password1)) 
                || (usernameInput.equals(username2) && passwordInput.equals(password2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
            
    }
}
