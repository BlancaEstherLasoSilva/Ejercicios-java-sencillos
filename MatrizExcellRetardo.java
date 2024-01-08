import java.util.Random;

public class MatrizExcellRetardo {
	 public static void main(String[] args) throws InterruptedException {
	        int[][] matriz = new int[4][5];

	        // Llenar la matriz con números aleatorios entre 1 y 10
	        Random random = new Random();
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                matriz[i][j] = random.nextInt(10) + 1;
	            }
	        }

	        // Mostrar la matriz
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Calcular las sumas parciales de las filas y mostrarlas
	        System.out.println("Sumas parciales de filas:");
	        for (int i = 0; i < 4; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < 5; j++) {
	                sumaFila += matriz[i][j];
	                Thread.sleep(500);
	            }
	            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
	           
	        }

	        // Calcular las sumas parciales de las columnas y mostrarlas
	        System.out.println("Sumas parciales de columnas:");
	        for (int j = 0; j < 5; j++) {
	            int sumaColumna = 0;
	            for (int i = 0; i < 4; i++) {
	                sumaColumna += matriz[i][j];
	                Thread.sleep(500);
	            }
	            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
	            
	            
	        }

	        // Calcular la suma total
	        int sumaTotal = 0;
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                sumaTotal += matriz[i][j];
	            }
	        }
	        System.out.println("Suma total: " + sumaTotal);
	    }
	}
