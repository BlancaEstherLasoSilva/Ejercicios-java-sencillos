import java.util.Arrays;
import java.util.Scanner;

public class VectorNumeros {

	 public static void main(String[] args) throws InterruptedException {
	        int[] vectorNumeros ={39, -2, 0, 0, 0, 5, 6, 14, 75,9};    
	        for (int i = 0; i < vectorNumeros.length; i++) {
	            System.out.println("Indice " + i );
	            System.out.println("Valor "+ vectorNumeros[i]);
	            
	            
	            Thread.sleep(500); // Retardo de medio segundo
	        }
	    }
	}