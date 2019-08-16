package inheritance.INHERITANCE2;

public class Nokia6610 extends Nokia1100 {

    public void carGame(){
        System.out.println();
    }
    public void digitalScreen(){
        System.out.println();
    }

    public static void main(String[] args) {
        Nokia6610 obj = new Nokia6610();
        obj.carGame();
        obj.digitalScreen();
        obj.internet();
        obj.phonebook();
        obj.sendText();

    }

    @Override
    public void sendText() {

    }

    @Override
    public void makeCall() {

    }
}
