public class DonorException extends Exception
{
    private String msg;
    public DonorException(){
        msg = "Error in Application... Try Again";
    }

    public DonorException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }

    @Override
    public String toString() {
        return "Exception in Donor: " + msg;
    }
}
