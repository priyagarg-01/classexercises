import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;

class AddRecords {
    Map<String, String> grades = new TreeMap<String, String>();
    Scanner src = new Scanner(System.in);
    String ans = "y";

    void input() {
        while (ans.equals("y")) {
            System.out.println("enter the name");
            String name = src.nextLine();
            System.out.println("enter the grade");
            String grade = src.nextLine();
            grades.put(name, grade);
            System.out.println("do you want to enter more values?");
            ans = src.nextLine();
        }
    }
}

class RemoveRecords{
    Map<String, String> grades = new TreeMap<String, String>();
    Scanner src = new Scanner(System.in);
    void remove(){
//        ListIterator itr=grades.entrySet().Listiterator();
    }
}

public class SortedMapP7{
    public static void main(String[] args) {
        Map<String,String> grades=new TreeMap<String,String>();
        AddRecords ar=new AddRecords();
        Scanner src=new Scanner(System.in);
        ar.input();
        System.out.println("Enter 1 to add records");
        System.out.println("enter 2 to remove records");
        System.out.println("enter 3 to modify records");

    }
}
