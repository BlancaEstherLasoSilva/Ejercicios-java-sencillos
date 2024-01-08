import java.util.Scanner;

public class CalculaPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int base;
	    int exponente;
	    System.out.println("Introduce la base: ");
	    base=leer.nextInt();
	    System.out.println("Introduce el exponente: ");
	    exponente=leer.nextInt();
	    int resultado = CalculatePower(base, exponente);
	    System.out.println("El resultado es: "+resultado);
	  }
	  static int CalculatePower(int num, int pow) {
	    if (pow == 0)
	      return 1;
	    else
	      return num * CalculatePower(num, pow - 1);
	}
 
}
