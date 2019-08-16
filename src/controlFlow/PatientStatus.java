package controlFlow;

public class PatientStatus {
    public static void main(String[] args) {
        int temparature = 37;
        char condition;

        if (temparature>=36){
            condition='a';

        }
        else if (temparature>= 35){
            condition='b';

        }
        else if(temparature>= 34){
            condition='c';

        }
        else {
            condition= 'N';

        }
        System.out.println("The patient body temparature is:"+ condition);
    }


    }

