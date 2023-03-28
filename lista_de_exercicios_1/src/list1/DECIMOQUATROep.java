package list1;
import java.util.Scanner;
public class DECIMOQUATROep {

	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double saldoInicial = 0;
	        System.out.print("Digite o valor do primeiro cheque: ");
	        double cheque1 = scanner.nextDouble();
	        System.out.print("Digite o valor do segundo cheque: ");
	        double cheque2 = scanner.nextDouble();

	        double valorRetirado = cheque1 + cheque2;
	        double cpmf = valorRetirado * 0.0038; // taxa de 0,38%

	        double saldoAtual = saldoInicial - valorRetirado - cpmf;

	        System.out.println("Saldo atual da conta bancária: R$" + saldoAtual);

	        scanner.close();
	    }
	}


