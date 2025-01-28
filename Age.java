
    import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {
   
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for birthdate input (in the format YYYY-MM-DD)
        System.out.println("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateString = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateString);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age by subtracting the birthdate from the current date
        Period age = Period.between(birthdate, currentDate);

        // Output the age
        System.out.println("Your age is: " + age.getYears() + " years, " 
                           + age.getMonths() + " months, and " 
                           + age.getDays() + " days.");

        // Close the scanner
        scanner.close();
}
}

