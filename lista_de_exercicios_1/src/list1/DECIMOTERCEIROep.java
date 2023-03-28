package list1;
import java.util.Scanner;
public class DECIMOTERCEIROep {

	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Entrada de dados
	        System.out.print("Informe o peso do saco de ração (em Kg): ");
	        double pesoRacaoKg = sc.nextDouble();
	        
	        System.out.print("Informe a quantidade de ração fornecida diariamente para cada gato (em gramas): ");
	        int quantidadeRacaoGato = sc.nextInt();

	        // Cálculo da quantidade de ração total fornecida diariamente
	        int quantidadeRacaoDiaria = quantidadeRacaoGato * 2; // dois gatos

	        // Cálculo da quantidade de ração consumida em cinco dias
	        int quantidadeRacaoConsumida = quantidadeRacaoDiaria * 5;

	        // Cálculo do peso restante do saco de ração após cinco dias
	        double pesoRacaoRestanteKg = pesoRacaoKg - quantidadeRacaoConsumida / 1000.0;

	        // Saída de dados
	        System.out.printf("Após cinco dias, restarão %.2f Kg de ração no saco.", pesoRacaoRestanteKg);

	        sc.close();
	    }
	}


