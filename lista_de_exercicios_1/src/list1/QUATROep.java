package list1;
import java.util.Scanner;
public class QUATROep {

	

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	      System.out.print("Digite o salário bruto do funcionário: ");
	      double salarioBruto = sc.nextDouble();

	      double gratificacao = salarioBruto * 0.1;
	      double salarioComGratificacao = salarioBruto + gratificacao;
	      double desconto = salarioComGratificacao * 0.15;
	      double salarioLiquido = salarioComGratificacao - desconto;

	      System.out.println("O salário líquido do funcionário é: R$" + salarioLiquido);

	      sc.close();
	   }
	}
	

