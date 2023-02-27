import java.util.HashSet;

//missing number
//{2,4,1,5,7,8,0}
//output 3 and 6

class missingnumber {
    public static void main(String[] args) {
        Integer a[] ={2,4,1,5,7,8,0};
        missingnumber(a);
    }
    public static void missingnumber(Integer a[])
    {
        HashSet<Integer>set = new HashSet<Integer>();

        for (int num:a){
            set.add(num);

        }
        int n=a.length+1;
        for(int i=0;i<n;i++)
        {
        if(!set.contains(i))
        System.out.println(i);
        }

    }
}