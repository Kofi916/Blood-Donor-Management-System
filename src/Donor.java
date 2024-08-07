public class Donor {
    private static int registrationId;
    private static int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String bloodGroup;
    private  int age;
    private String city;

    public Donor(String firstName, String lastName, String mobileNo, String bloodGroup, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.city = city;
        id++;
        registrationId=id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static int getRegistrationId() {
        return registrationId;
    }

    public static void setRegistrationId(int registrationId) {
        Donor.registrationId = registrationId;
    }
}
