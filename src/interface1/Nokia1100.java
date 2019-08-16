package interface1;

public class Nokia1100 extends Nokia5510 {
    static String nokia100;

    int x;
    public void addPhotoGallary (){
        System.out.println("This is the photo Gallery of this phone");
    }
    public Nokia1100(int x){
        this.x=x;
        System.out.println(" This is default constructor");

    }
    public void addColourfulDisplay(){
        System.out.println("Colourful display is added");

    }

    public static void main(String[] args) {
        Nokia1100 phone = new Nokia1100(2);
        phone.makeCall();
        phone.sendText();
        phone.addPhotoGallary();
        phone.addColourfulDisplay();
        phone.contactList();


    }

}
