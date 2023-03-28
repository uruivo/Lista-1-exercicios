package list1;
import java.util.Scanner;
public class DECIMOSEGUNDOep {

	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // recebe a altura do degrau em metros
	        System.out.print("Digite a altura do degrau em metros: ");
	        double alturaDegrau = input.nextDouble();

	        // recebe a altura que o usuário deseja alcançar em metros
	        System.out.print("Digite a altura que deseja alcançar em metros: ");
	        double alturaObjetivo = input.nextDouble();

	        // calcula a quantidade de degraus necessários para atingir o objetivo
	        int quantidadeDegraus = (int) Math.ceil(alturaObjetivo / alturaDegrau);

	        // exibe a quantidade de degraus necessários
	        System.out.println("Você precisa subir " + quantidadeDegraus + " degraus.");
	    }
	}


