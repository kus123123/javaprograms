package java;
public class splitts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "091-1234567";
		String str[] = s.split("-");
		
	}
	public static void printstring(String str[],String approach) {
		System.out.println("Spliting string using "+approach);
		for(String string : str) {
			System.out.println(string);
		}
	}
}
