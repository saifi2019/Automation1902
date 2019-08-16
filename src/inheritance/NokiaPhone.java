package inheritance;

public class NokiaPhone extends SampleNokiaPhone {
    public void makeCall(){
        System.out.println("This phone can make a call");
    }

    public static void main(String[] args) {
        NokiaPhone objNokiaPhone = new NokiaPhone();
        objNokiaPhone.sendText();
        objNokiaPhone.makeCall();
        objNokiaPhone.createcontacts();

        System.out.println("Calling instance variable from other class"+ objNokiaPhone.x);


    }

}
