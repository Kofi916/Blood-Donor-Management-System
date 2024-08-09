import java.util.regex.Pattern;



public class DonorValidation {

    public static boolean validateFirstName(String fname) throws DonorException{
        String pattern = "[A-Za-z]{3,8}";
        if(Pattern.matches(pattern,fname)){
            return true;
        }else {
            throw new DonorException("First Name should be Min 3 to Max 8 Characters...");
        }
    }
    public static boolean validateLastName(String lname) throws DonorException{
        String pattern = "[A-Za-z]{3,9}";
       if(Pattern.matches(pattern,lname)){
            return true;
        }else {
            throw new DonorException("Last Name should be Min 3 to Max 9 Characters...");
        }
    }
    public static boolean validateMobileNo(String phone) throws DonorException{
        String pattern = "[0-9]{10}";
       if(Pattern.matches(pattern,phone)){
            return true;
        }else {
            throw new DonorException("Mobile No should be of 10 digits...");
        }
    }
    public static boolean validateBloodGroup(String group) throws DonorException {
        String pattern = "[A][B][AB][O]{1,2}";
        if (Pattern.matches(pattern, group)) {
            return true;
        } else {
            throw new DonorException("Only A,B,AB,O blood group allowed...");
        }
    }

    public static boolean validateAge(int age) throws DonorException{


       if(age<21){

            throw new DonorException("Age should be minimum 21 to donate blood...");
        }else {
           return true;
       }

    }

}
