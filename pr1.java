import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class pr1 {
    public static void main(String[] args) {
        HashSet <String> set =new HashSet<>();

        set.add("kushagra");
        set.add("anuj");
        set.add("vikas");
        set.add("rohit");

        if(set.contains("anuj"))
        System.out.println("contain anuj");
        else
        System.out.println("does not have anuj");
        
        set.remove("kushagra");
        System.out.println(set);

        Iterator<String> it = set.iterator(); 
        
        while(it.hasNext())
     {
        System.out.println((it.next()));
    }



    }
}
