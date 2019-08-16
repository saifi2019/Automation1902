package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1902 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Jamal");
        list.add("Kamal");
        list.add("Selim");
        list.add("Rahim");
        list.remove("Rahim");

        System.out.println("value of index 0 is:"+list.get(0));
        System.out.println("Value of Second index is :"+list.get(2));


        for(String str: list){
            System.out.println(str);
        }
        list.forEach(str->System.out.println(str));
        }



        }




