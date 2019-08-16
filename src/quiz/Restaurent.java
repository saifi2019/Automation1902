package quiz;


public class Restaurent {


    static String restaurentName= "Red lobster";
    static int noOfPeople= 5;

    int x=20;
    int y=30;
    int z=40;

    public Restaurent(){
        System.out.println( "This is a default contractor ");
    }

    public void totalBll(){
        int salmonPrice=20;
        int beef= 25;
        int chicken=20;
        int total=salmonPrice+beef+chicken;
        System.out.println("Total bill for two customer is: "+ total);

    }

    public static void main(String[] args) {
        Restaurent myBill= new Restaurent();
        myBill.totalBll();
        int noOfguest = Restaurent.noOfPeople;
        System.out.println("Total no of guest:"+ noOfPeople);
        System.out.println(" Restaurent Name is :"+ restaurentName);
        int variablex= myBill.x;
        System.out.println("Variable value is:"+ variablex);
        int variabley=myBill.y;
        System.out.println("Variable y value is :"+ variabley);
        int variablez =myBill.z;
        System.out.println(" Variable z value is:"+ variablez);





    }

}
