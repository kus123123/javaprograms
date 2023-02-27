
class employee
{
    int id;
    String name ;
    public void info(){
        System.out.println("name is " + name);
        System.out.println(" id is " + id);
        System.out.println("unique id is " +name + id);
    }

}
class salary{
    int netsalary;
    int grosssalary;
    public void netsalary(){
        int total_salary=netsalary-grosssalary;    
        System.out.println("the net salary is " + netsalary);
        System.out.println("the gross salary is" + grosssalary);
        System.out.println("total salary is " + total_salary);
    }
    
}
class rent {
    int rentpaid;
    int rentcollected;
    public void extraincome(){
        System.out.println("rent paid" + rentpaid);
        System.out.println("rent collected" + rentcollected);
        int ti=rentcollected -  rentpaid;
        System.out.println("totoal income is " + ti);
    }


}
public class customclass{
    public static void main(String[] args) {
        System.out.println("this is custom class");
        employee harry =new employee();
        salary s1=new salary();
        rent r1=new rent ();

        {
        harry.id=12;
        harry.name="harry";
        s1.grosssalary=20000;
        s1.netsalary=15000;
            r1.rentcollected=3000;
            r1.rentpaid=20000;
            harry.info();
            s1.netsalary();
            r1.extraincome();
    }
    {
            
    employee a2=new employee();
    salary s2=new salary();
    rent r2=new rent();    
    a2.id=2;
    a2.name="kushagra";
    s2.grosssalary=30000;
    s2.netsalary=20000;
    r2.rentcollected=20000;
    r2.rentpaid=2000;
    a2.info();  
    s2.netsalary();
    r2.extraincome();    
    }
        

    }
}