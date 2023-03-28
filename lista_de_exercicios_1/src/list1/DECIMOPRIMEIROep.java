package list1;
import java.util.Scanner;
public class DECIMOPRIMEIROep {

	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o valor de referência: ");
	        double valorReferencia = sc.nextDouble();

	        double valorKw = valorReferencia / 5;
	        System.out.println("Valor de cada kW: R$" + valorKw);

	        System.out.print("Digite a quantidade de kWh consumida pela residência: ");
	        double quantidadeKw = sc.nextDouble();

	        double valorConta = quantidadeKw * valorKw;
	        System.out.println("Valor a ser pago pela residência: R$" + valorConta);

	        double valorContaComBonus = valorConta * 0.83;
	        System.out.println("Valor a ser pago com bônus de 17%: R$" + valorContaComBonus);

	        System.out.print("Digite a quantidade de dias de atraso: ");
	        int diasAtraso = sc.nextInt();

	        double valorMulta = valorConta * (0.005 * diasAtraso);
	        double valorContaComMulta = valorConta + valorMulta;
	        System.out.println("Valor a ser pago com " + diasAtraso + " dias de atraso: R$" + valorContaComMulta);

	        sc.close();
	    }
	}


