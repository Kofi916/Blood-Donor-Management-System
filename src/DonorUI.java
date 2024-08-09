import java.util.Scanner;

public class DonorUI {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        DonorCollection dc = new DonorCollection();

        while (true) {
            try {
                System.out.println("--------- Online Donor Registration------------");
                System.out.println("1. Adding a Donor");
                System.out.println("2. Display all Donors");
                System.out.println("3. Exit the Application");
                System.out.print("Enter a Choice: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter Your First Name: ");
                        String fname = sc.next();
                        if (DonorValidation.validateFirstName(fname)) {
                            System.out.print("Enter Your Last Name: ");
                            String lname = sc.next();
                            if (DonorValidation.validateLastName(lname)) {
                                System.out.print("Enter Contact No: ");
                                String phone = sc.next();
                                if (DonorValidation.validateMobileNo(phone)) {
                                    System.out.print("Enter Your Blood Group: ");
                                    String group = sc.next();
                                    if (DonorValidation.validateBloodGroup(group)) {
                                        System.out.print("Enter Your Age: ");
                                        int age = sc.nextInt();
                                        if (DonorValidation.validateAge(age)) {
                                            System.out.print("Enter Your City: ");
                                            String city = sc.next();


                                            dc.addDonor(fname, lname, phone, group, age, city);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        dc.dispDonor();
                        break;
                    case 3:
                        System.out.println("exit");
                        break;

                    default:
                        System.out.println("Invalid Selection");
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

        }
    }
}
