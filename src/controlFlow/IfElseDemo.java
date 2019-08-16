package controlFlow;

public class IfElseDemo {
    public static void main(String[] args) {
        boolean rain=false;

        if (rain==true){
            boolean wiper = true;
            System.out.println("Its raining so wiper is on");
        }
        else{
            rain= false;
            boolean wiper = false;
            System.out.println(" Its not raining so wiper is off");
        }
    }
}

