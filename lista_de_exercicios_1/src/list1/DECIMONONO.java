package list1;
import java.util.Scanner;
public class DECIMONONO {

	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o tempo em segundos: ");
	        long tempoSegundos = sc.nextLong();

	        long horas = tempoSegundos / 3600;
	        long minutos = (tempoSegundos % 3600) / 60;
	        long segundos = tempoSegundos % 60;
	        long milissegundos = segundos * 1000;

	        System.out.printf("Tempo: %d horas, %d minutos, %d segundos e %d milissegundos.", horas, minutos, segundos, milissegundos);

	        sc.close();
	    }

	}


