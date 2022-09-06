import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;

public class spellchecker {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet <String> dict=new HashSet<String>();
        HashSet <String> words=new HashSet<String>();
        //System.out.println("--------------------dictionary file--------------");
        FileReader obj1 = new FileReader("dictionary.txt");
        Scanner reader1=new Scanner(obj1);
        while (reader1.hasNextLine()){
            String val=reader1.nextLine();
            dict.add(val);
        }
        //System.out.println("--------------------word file--------------");
        FileReader obj2 = new FileReader("words.txt");
        Scanner reader2=new Scanner(obj2);


        while (reader2.hasNextLine()){
            String val=reader2.nextLine();
            words.add(val);
            //System.out.println(val);
        }
        //System.out.println(words);
        /*words.removeAll(dict);
        System.out.println(words);*/
            for (String b:dict){
                if (dict.contains(b)){
                    words.remove(b);
                }
            }
        System.out.println(words);
    }
}
