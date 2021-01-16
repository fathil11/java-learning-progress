
public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone doesn't have power on function");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + " on mobile phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring ...");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
