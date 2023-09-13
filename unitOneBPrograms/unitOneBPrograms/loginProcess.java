import java.util.Scanner;

public class loginProcess
{
    public static void main(String[] args)
    {
        Scanner scanUsername = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String username = scanUsername.nextLine();
        scanUsername.close();
        
        System.out.println("");
        
        Scanner scanPassword = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        int password = scanPassword.nextInt();
        scanPassword.close();
        
        System.out.println("Confirming Login...");
        
        String usernameValue = "Username_9241";
        int passwordValue = 7443614;
        boolean checkUsername = username.equals(usernameValue);
        boolean checkPassword = password == passwordValue;
        if (checkUsername == true && checkPassword == true) {
            System.out.println("You have successfully logged in.");
        } else {
            System.out.println("Login unsuccessful...try again.");
        }
    }
}
