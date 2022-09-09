import java.util.*;

public class GradedAs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, List> players=new HashMap<String,List>();

        System.out.println("enter the numbers of players you want to list");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter the name of the player");
            String name=sc.next();
            System.out.println("enter the Id ");
            int Id=sc.nextInt();
            System.out.println("Enter the strike rate");
            int srate= sc.nextInt();
            System.out.println("enter the rate ");
            int rate=sc.nextInt();
            System.out.println("enter the Runs");
            int runs= sc.nextInt();
            List<Integer> a=new ArrayList<>();
            a.add(Id);
            a.add(srate);
            a.add(rate);
            a.add(runs);
            players.put(name,a);

        }
        System.out.println(players);
        System.out.println("Enter the number of players you want to select");
        int s= sc.nextInt();
        for (int i=0;i<s;i++){
            System.out.println(players.values());
        }
    }

}
