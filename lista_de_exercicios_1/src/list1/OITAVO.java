package list1;
import java.util.Scanner;
public class OITAVO {

	

	
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Digite um número: ");
	    int num = input.nextInt();

	    for (int i = 1; i <= 10; i++) {
	      System.out.printf("%d x %d = %d\n", num, i, num * i);
	    }

	    input.close();
	  }
	}
	

