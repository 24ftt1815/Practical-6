import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String username = input.nextLine();
        System.out.println("Please enter the password:");
        String password = input.nextLine();

    
        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedLDT = ldt.format(dtf);


        // if (username.equals("Ahmad Ali") && password.equals("12345")){
        //     System.out.println("Welcome Ahmad Ali. The time now is "+ formattedLDT);
        // }
        
        if (username.equals("Ahmad Ali")){
            if (password.equals("12345")){
                System.out.println("Welcome Ahmad Ali. The time now is "+ formattedLDT);
            }
            else {
                System.out.println("Error: Password does not match.");
            }
        }
        else {
            System.out.println("Error: Invalid Username.");
        }

    }
}
