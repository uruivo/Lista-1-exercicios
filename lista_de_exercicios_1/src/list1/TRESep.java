package list1;
import java.util.Scanner;
public class TRESep {

	


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite o nome do funcionário: ");
	        String nome = input.nextLine();
	        
	        System.out.print("Digite o salário atual do funcionário: ");
	        double salario = input.nextDouble();
	        
	        double novoSalario = salario * 1.25; // aumento de 25%
	        double aumento = novoSalario - salario;
	        
	        System.out.printf("O novo salário do(a) %s é R$ %.2f, um aumento de R$ %.2f.", nome, novoSalario, aumento);
	        
	        input.close();
	    }
	}
	

