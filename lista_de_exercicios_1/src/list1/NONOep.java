package list1;
import java.util.Scanner;
public class NONOep {

	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o valor de a: ");
	        double a = input.nextDouble();

	        System.out.print("Digite o valor de b: ");
	        double b = input.nextDouble();

	        System.out.print("Digite o valor de c: ");
	        double c = input.nextDouble();

	        double delta = Math.pow(b, 2) - 4 * a * c;

	        if (delta < 0) {
	            System.out.println("A equação não possui raízes reais.");
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            System.out.println("A equação possui uma única raiz real: x = " + x);
	        } else {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("A equação possui duas raízes reais: x1 = " + x1 + " e x2 = " + x2);
	        }

	        input.close();
	    }
	}
	

