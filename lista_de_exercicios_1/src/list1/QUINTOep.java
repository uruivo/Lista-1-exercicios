package list1;
import java.util.Scanner;
public class QUINTOep {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor do depósito: ");
	        double valorDeposito = sc.nextDouble();

	        System.out.print("Digite a taxa de juros (%): ");
	        double taxaJuros = sc.nextDouble();

	        double rendimento = valorDeposito * (taxaJuros / 100);
	        double valorTotal = valorDeposito + rendimento;

	        System.out.printf("Valor do rendimento: R$ %.2f%n", rendimento);
	        System.out.printf("Valor total após o rendimento: R$ %.2f", valorTotal);

	        sc.close();
	    }
	}
	

