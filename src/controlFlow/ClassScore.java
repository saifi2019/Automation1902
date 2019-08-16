package controlFlow;

public class ClassScore {
    public static void main(String[] args) {
        int score= 60;
        char grade;

         if (score>= 90){
            grade='A';
        }
       else if (score>= 80){
            grade= 'B';
        }
       else
             grade = 'F';
        System.out.println(" Actual grade is :"+ grade);


    }

}
