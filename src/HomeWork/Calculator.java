package HomeWork;

public class Calculator {
    String statement;
    static String statement1;
    public Calculator(){
        System.out.println("This calculator can create basic calculator object");
    }
    public Calculator(String statement) {
        this.statement= statement;

    }
    public int multiply(int a, int b){
        int result= a*b;
        System.out.println("Total is:"+ result);
        return result;

    }
    public int add(int x, int y){
        int result = x+y;
        System.out.println("Total is:"+result);
        return result;

    }



    public static void main(String[] args) {
        Calculator basicCalculator= new Calculator();
        basicCalculator.add(4,5);
        basicCalculator.multiply(4, 5);

        Calculator scientificCalculator= new Calculator();
        scientificCalculator.add(4,5);
        scientificCalculator.multiply(4,5);

    }
}
