package list1;
import java.util.Scanner;
public class DECIMOQUINTO {

	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int anoAtual, anoNasc, idade, diasVividos;

	        System.out.print("Digite o ano de nascimento: ");
	        anoNasc = sc.nextInt();

	        System.out.print("Digite o ano atual: ");
	        anoAtual = sc.nextInt();

	        idade = anoAtual - anoNasc;
	        diasVividos = idade * 365; // aproximadamente, considerando anos bissextos

	        System.out.println("Idade: " + idade + " anos");
	        System.out.println("Dias vividos até 2050: aproximadamente " + diasVividos * 2 + " dias");
	    }
	}


