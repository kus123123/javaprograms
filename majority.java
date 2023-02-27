import java.util.HashMap;
import java.util.Map;



public class majority{
public static void main(String[] args) {
    int a[]={2,3,4,5,3,4,3,3,3,5};
    System.out.println("Majority element :");
    int x = majorityclass(a, 10);
}
    

public static int majorityclass(int a[], int size)
{
    HashMap<Integer,Integer> map =new HashMap<Integer , Integer>();
    for (int i : a)
    {
    Integer val = map.get(i);

    if(val==null)
    {
        map.put(i,1);

    }
    else
    {
        map.put(i,val+1);
    }}

    for(Map.Entry<Integer ,Integer> entry : map.entrySet())
{
    if(entry.getValue()>size/2)
    {
    return entry.getKey();
    }
}
return 0;
}

}


