import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class AliceP7 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        List<String> words=new LinkedList<String>();
        String data="";
        FileReader obj=new FileReader("alice_in_wonderland.txt");
        Scanner read1=new Scanner(obj);
        while (read1.hasNextLine()){
            data=read1.nextLine().trim();
            words.addAll(List.of(data.trim().split(" ")));
        }
        ListIterator<String> itr= words.listIterator();
        while (itr.hasNext()){
            String s= itr.next();
            //System.out.println(s.length()+s+" ");
            //System.out.println(s.codePointAt(s.length() - 1));
            if (s.length()==0){
                itr.remove();
            }
            else if (((s.codePointAt(s.length() - 1)) <= 64) && ((s.codePointAt(s.length() - 1)) >= 32)){
                String sub=s.substring(0,s.length()-1);
                itr.set(sub);
            }
            else if ((((s.codePointAt(0) <= 64) && ((s.codePointAt(0)) >= 32)) || ((s.codePointAt(0)) ==96))){
                System.out.println(s);
                String sub=s.substring(1);
                itr.set(sub);

            }

        }
        for (String s:words){
            map2.putIfAbsent(s,Collections.frequency(words,s));
        }

        for (String s:words){
            int count=0;
            ListIterator<String> itr1= words.listIterator();
            while (itr1.hasNext()){
                if (s.equals(itr1.next())){
                count++;}
            }
            map1.putIfAbsent(s,count);
        }
        System.out.println(map1);
        System.out.println(map2);

    }
}
