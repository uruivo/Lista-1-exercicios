package list1;
import java.util.Scanner;
public class DECIMOSEXTOep {


	

	    public static void main(String[] args) {

	        // Definindo constantes das conversões
	        final double POLEGADAS_POR_PE = 12.0;
	        final double PES_POR_JARDA = 3.0;
	        final double JARDAS_POR_MILHA = 1760.0;

	        // Recebendo a medida em pés do usuário
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a medida em pés: ");
	        double medidaEmPes = scanner.nextDouble();

	        // Convertendo para polegadas
	        double medidaEmPolegadas = medidaEmPes * POLEGADAS_POR_PE;
	        System.out.println("A medida em polegadas é: " + medidaEmPolegadas);

	        // Convertendo para jardas
	        double medidaEmJardas = medidaEmPes / PES_POR_JARDA;
	        System.out.println("A medida em jardas é: " + medidaEmJardas);

	        // Convertendo para milhas
	        double medidaEmMilhas = medidaEmPes / (JARDAS_POR_MILHA * PES_POR_JARDA);
	        System.out.println("A medida em milhas é: " + medidaEmMilhas);

	        scanner.close();
	    }
	}


