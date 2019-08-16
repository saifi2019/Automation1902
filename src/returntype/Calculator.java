package returntype;

public class Calculator {

    static int a;
    static int b;
    static int c;
    public Calculator(){
        System.out.println("I am constructor");
    }
    public void calculate(){
        int x=5;
        int y=6;
        int z=7;
        Calculator.a=2;
        Calculator.b=3;
        Calculator.c=4;
        int sum= x+y+z+a+b+c;
        System.out.println(" The total value is :"+ sum);
    }

    public static void main(String[] args) {
        Calculator casio= new Calculator();
        casio.calculate();
    }
}
