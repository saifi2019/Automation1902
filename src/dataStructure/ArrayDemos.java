package dataStructure;

public class ArrayDemos {
    public static void main(String[] args) {

        try {


            String[] students = new String[4];
            students[0] = "rahul";
            students[1] = "Midul";
            students[2] = "Zahidul";


            System.out.println(students.length);

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);

            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("");
        }

    }
}



