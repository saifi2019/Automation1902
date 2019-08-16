package inheritance;

public abstract class SampleNokiaPhone implements SymbianPhone {
    int x;

    public void sendText(){
        System.out.println("This method is responsible to send text");
    }

    public abstract void makeCall();
    public void createcontacts(){
        System.out.println("This method will create contact");
    }
}
