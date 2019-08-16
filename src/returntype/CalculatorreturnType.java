package returntype;

public class CalculatorreturnType {
    static int a;
    static int b;
    static int c;
    public CalculatorreturnType(){
        System.out.println("This is return type example");
    }

    public int calculate(){
     int x=6;
     int y=7;
     int z= 8;
     CalculatorreturnType.a=3;
     CalculatorreturnType.b=4;
     CalculatorreturnType.c=5;
     int sum= x+y+z+a+b+c;
     System.out.println(" Total value is:"+ sum);
     return sum;


    }

    public static void main(String[] args) {
        CalculatorreturnType casio = new CalculatorreturnType();
        int total = casio.calculate();
        System.out.println("The total return value is :"+ total);
    }
}
