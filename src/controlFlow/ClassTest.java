package controlFlow;

public class ClassTest {
    public static void main(String[] args) {
        int score = 95;
        char grade;
        if(score>= 90){
            grade='A';
        }
        else  if (score>= 80){
            grade='b';

        }
        else if (score>=70){
            grade= 'c';
        }
        else {
            grade='d';
        }
        System.out.println(" The Actual grade is "+ grade);
    }
}
