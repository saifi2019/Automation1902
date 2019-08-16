package controlFlow;

public class TestScore {
    public static void main(String[] args) {
        int testScore= 82;
        char grade;
        if (testScore >= 90){
            grade ='a';
        }
        else if (testScore>= 80){
            grade= 'b';
        }
        else if (testScore>= 70){
            grade = 'c';

        }
        else if (testScore>= 60){
            grade= 'd';

        }
        else {
            grade='f';

        }
        System.out.println("The actual grade is:"+grade);
    }

}
