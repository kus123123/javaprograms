import java.util.Scanner;
public class sortnames
{
    public static void main(String[] args) {
        int n ;
        String temp;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of name you need to sort");
         n = sc.nextInt();
        String names[] = new String [n];
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter the names of element");
        for(int i=0;i<n;i++)
        {
            
            names[i]=sc1.next();

        }

        for (int i=0;i<n;i++)
        {
        for (int j=i+1;j<n;j++)
        {
            if(names[i].compareTo(names[j])>0)
            {
                temp=names[i];
                names[i]=names[j];
                names[j]=temp;

            }

        }


    }
    for(String name :names)
    {
        System.out.println("sorted array=");
        System.out.println(name);
    }

}
}
