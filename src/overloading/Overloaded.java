package overloading;

public class Overloaded {
    public int addition(int x, int y){
        int sum = x+y;
        System.out.println(" total is :"+ sum);

        return sum;

    }
    public int addition(int y, int x, int z){
        int sum= y+x;
        System.out.println(" total is :"+ sum);

        return sum;
    }
    public int addition(int x, byte y){
        int sum =x+y;
        System.out.println(" total is :"+ sum);
        return x+y;
    }

    public static void main(String[] args) {
        Overloaded obj = new Overloaded();
        obj.addition(3,4,5);
        obj.addition(5,6);
        obj.addition(4,8);
        System.out.println("Total is " );
    }
}
