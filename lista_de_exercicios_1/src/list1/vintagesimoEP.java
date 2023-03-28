package list1;
import java.util.Scanner;
public class vintagesimoEP {

	

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite a quantidade de dias: ");
	        int dias = sc.nextInt();

	        int horas = dias * 24;
	        double meses = dias / 30.0;
	        double trimestres = meses / 3.0;
	        double semestres = meses / 6.0;
	        double anos = meses / 12.0;
	        double decadas = anos / 10.0;

	        System.out.println(dias + " dias equivalem a:");
	        System.out.println(horas + " horas");
	        System.out.printf("%.2f meses%n", meses);
	        System.out.printf("%.2f trimestres%n", trimestres);
	        System.out.printf("%.2f semestres%n", semestres);
	        System.out.printf("%.2f anos%n", anos);
	        System.out.printf("%.2f décadas%n", decadas);

	        sc.close();
	    }
	}


