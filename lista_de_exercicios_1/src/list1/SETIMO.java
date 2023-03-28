package list1;
import java.util.Scanner;
public class SETIMO {

	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o raio do círculo: ");
	        double raio = input.nextDouble();

	        double area = Math.PI * Math.pow(raio, 2);
	        double perimetro = 2 * Math.PI * raio;

	        System.out.println("Área do círculo: " + area);
	        System.out.println("Perímetro do círculo: " + perimetro);
	    }
	}


