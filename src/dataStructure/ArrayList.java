package dataStructure;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> studentName = new java.util.ArrayList<>();
        studentName.add("Mahmudul");
        studentName.add("Alma");
        studentName.add("Salma");
        studentName.add("Rafi");

        //studentName.remove(0);

        for (String str: studentName){
          System.out.println(str);

        }
        //System.out.println("Value of index 0 is: "+studentName.get(0));
        //System.out.println("Value of index 0 is: "+studentName.get(1));
     studentName.forEach(str-> System.out.println(str));
    }


}
