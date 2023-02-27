package kus1;

public class static1 {
int x , y;
static int a=10;
}

 class static12 {

	public static void main(String args[]) {
		static1 st = new static1();
		int xx=st.x=1;
		int yy=st.y=2;
		int sum =xx+yy;
		int sum2=xx+yy;
		System.out.println(sum);
		System.out.println(sum2);
		
		
				

}
}

