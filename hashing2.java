import java.util.HashMap;

class hashing2 {
    public static void main(String[] args) {
      
        HashMap<String , Integer > map = new HashMap<>();

        //insertion
        map.put("india" ,120);
        map.put("US" ,30);
        map.put("China" ,150);

        System.out.println(map);
       
        map.put("China" ,123);
        System.out.println(map);
        
        // searching
        if(map.containsKey("india"))
        {
            System.out.println("contains");
        }
            else
            {System.out.println("soes not continan");
    
    }


    
        }

    }
