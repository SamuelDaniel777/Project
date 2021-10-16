import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter amount of values to add");
		
		Scanner sc= new Scanner(System.in);
		int i= Integer.parseInt(sc.next());
		ArrayList ar=new ArrayList<>();
		ar.add(i);
		System.out.println(ar);
		
	}

}
