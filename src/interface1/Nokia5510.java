package interface1;

public abstract class Nokia5510 implements SymbianPhone {

    String nameOfTheClass ="PreNokia1100";
    public  void sendText(){
        System.out.println("This method will dend text");
    }
    public void makeCall(){
        System.out.println("This method can make call");
    }
    public void contactList(){
        System.out.println("This method can save contact");
    }

    public abstract void addColourfulDisplay();

}
