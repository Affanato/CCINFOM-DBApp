
import java.sql.Connection;
import java.util.Scanner;

public class User {
    private Scanner scanner = new Scanner(System.in);

    public int selectTable() {
        System.out.println("Select table:");
        System.out.println("1. Member");
        System.out.println("2. Membership");
        System.out.println("3. Branch");
        System.out.println("4. Trainer");
        System.out.println("5. Product");
        System.out.print("Select: ");

        int action = scanner.nextInt();
        scanner.nextLine();

        return action;
    }

    public int selectAction() {
        System.out.println("Select action:");
        System.out.println("1. Insert record");
        System.out.println("2. Update record");
        System.out.println("3. Delete record");
        System.out.println("4. View table");
        System.out.print("Select: ");

        int action = scanner.nextInt();
        scanner.nextLine();

        return action;
    }

    public void actionBranch(Branch branch, int action) {
        int branchId;
        String branchName, street, city, region;
        String country, telephone, emailAddress;
        String status, businessHours, managerName;
        String managerContact, membershipPlans;
    
        if (action == 1)
        {
            System.out.println("Kindly input what is being asked.");
            System.out.print("Branch Name: ");
            branchName = scanner.nextLine();
            System.out.print("Street: ");
            street = scanner.nextLine();
            System.out.print("City: ");
            city = scanner.nextLine();
            System.out.print("Region: ");
            region = scanner.nextLine();
            System.out.print("Country: ");
            country = scanner.nextLine();
            System.out.print("Telephone: ");
            telephone = scanner.nextLine();
            System.out.print("Email Address: ");
            emailAddress = scanner.nextLine();
            System.out.print("Status: ");
            status = scanner.nextLine();
            System.out.print("Business Hours: ");
            businessHours = scanner.nextLine();
            System.out.print("Manager Name: ");
            managerName = scanner.nextLine();
            System.out.print("Manager Contact: ");
            managerContact = scanner.nextLine();
            System.out.print("Membership Plans: ");
            membershipPlans = scanner.nextLine();
            branch.insertBranch(branchName, street, city, region, country, telephone, emailAddress, status, businessHours, managerName, managerContact, membershipPlans);
        } else if (action == 2)
        {
            System.out.println("Kindly input what is being asked.");
            System.out.print("Branch ID: ");
            branchId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Branch Name: ");
            branchName = scanner.nextLine();
            System.out.print("Street: ");
            street = scanner.nextLine();
            System.out.print("City: ");
            city = scanner.nextLine();
            System.out.print("Region: ");
            region = scanner.nextLine();
            System.out.print("Country: ");
            country = scanner.nextLine();
            System.out.print("Telephone: ");
            telephone = scanner.nextLine();
            System.out.print("Email Address: ");
            emailAddress = scanner.nextLine();
            System.out.print("Status: ");
            status = scanner.nextLine();
            System.out.print("Business Hours: ");
            businessHours = scanner.nextLine();
            System.out.print("Manager Name: ");
            managerName = scanner.nextLine();
            System.out.print("Manager Contact: ");
            managerContact = scanner.nextLine();
            System.out.print("Membership Plans: ");
            membershipPlans = scanner.nextLine();
            branch.updateBranch(branchId, branchName, street, city, region, country, telephone, emailAddress, status, businessHours, managerName, managerContact, membershipPlans);
        } else if (action == 3) {
            System.out.println("Kindly input what is being asked.");
            System.out.print("Branch ID: ");
            branchId = scanner.nextInt();
            scanner.nextLine();
            branch.deleteBranch(branchId);
        } else if (action == 4) {
            branch.selectAllBranch();
        } else {
            System.out.println("Invalid selection.");
        }
    }


    public void yooser(Connection con) {
        User user = new User();
        
        int table = selectTable();
        int action = selectAction();

        Branch branch = new Branch(con);

        actionBranch(branch, action);
    }
}
