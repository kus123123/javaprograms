import java.util.HashMap;
import java.util.Map;



public class majorityclass{
public static void main(String[] args) {
    int a[]={2,3,4,5,3,4,3,3,3,5};
    System.out.println("Majority element :");
    majorityclass(a, 10);
}
    

static int majorityclass(int a[], int size)
{
    Map<Integer,Integer> map =new HashMap<Integer , Integer>();
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

}
}}


