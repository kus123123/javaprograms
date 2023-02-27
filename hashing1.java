import java.util.HashSet;
import java.util.Iterator;



class hashing1 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //searching
        // if(set.contains(1))
        // System.out.println("contains 1");
        // else
        // System.out.println("does not contain");
    
        // deletes
        // set.remove(2);
        // if(set.contains(2))
        // System.out.println("contin 2");
        // else
        // System.out.println("does not contain 2");

        // iterating
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        };
    }
