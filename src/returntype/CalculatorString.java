package returntype;

public class CalculatorString {

    static String firstName;
    static String lastName;
    static String surName;
     public CalculatorString(){
      System.out.println(" String return type variable");
     }
    public void   fullName(){
         String fathersName= " Habib";
         CalculatorString.firstName=" Rahim";
         CalculatorString.lastName=" Karim";
         CalculatorString.surName= " Jodu";
         String fullName= firstName +fathersName +lastName +surName;
         System.out.println("The full name of the person is:"+fullName);

    }

    public static void main(String[] args) {
        CalculatorString person=new CalculatorString();
        person.fullName();
    }

    }

