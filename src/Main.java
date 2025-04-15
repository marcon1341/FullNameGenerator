import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // asks first name
        System.out.println("Please Enter Your Name\nFirst Name: ");
        String firstName = s.nextLine().trim();

        //asks middle name
        System.out.println("Middle Name: ");
        String middleName = s.nextLine().trim();

        //asks last name
        System.out.println("Last Name: ");
        String lastName = s.nextLine().trim();

        //asks suffix
        System.out.println("Suffix: ");
        String suffix = s.nextLine().trim();

        String fullName = firstName;

        //add middle name
        if(!middleName.isEmpty()){
            fullName += " " + middleName.charAt(0) + ".";
        }
        fullName += " " + lastName;

        //add suffix
        if(!suffix.isEmpty()){
            fullName += "," + suffix;
        }

        System.out.println("\nFull Name: " + fullName);
    }
}
