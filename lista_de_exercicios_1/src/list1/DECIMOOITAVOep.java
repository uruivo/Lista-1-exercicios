package list1;
import java.util.Scanner;
public class DECIMOOITAVOep {

	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor da primeira conta a ser paga: ");
	        double conta1 = scanner.nextDouble();
	        System.out.print("Digite o valor da segunda conta a ser paga: ");
	        double conta2 = scanner.nextDouble();
	        System.out.print("Digite o valor do salário de João: ");
	        double salario = scanner.nextDouble();

	        double multa1 = conta1 * 0.02;
	        double multa2 = conta2 * 0.035;

	        double valorTotal = conta1 + multa1 + conta2 + multa2;
	        double salarioRestante = salario - valorTotal;

	        System.out.println("Após pagar as contas, restará R$" + salarioRestante + " do salário de João.");
	    }
	}


