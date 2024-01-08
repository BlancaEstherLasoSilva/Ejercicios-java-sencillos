
public class CuadradoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[20];
	    int[] cua = new int[20];
	    int[] cub = new int[20];
	    
	    for (int i = 0; i < 20; i++) {
	      num[i] = (int)(Math.random() * 101);
	    }
	    
	    for (int i = 0; i < 20; i++) {
	      cua[i] = num[i] * num[i];
	    }
	    
	    for (int i = 0; i < 20; i++) {
	      cub[i] = num[i] * num[i] * num[i];
	    }
	    
	    System.out.println("Número\tCuadrado\tCubo");
	    for (int i = 0; i < 20; i++) {
	      System.out.println(num[i] + "\t" + cua[i] + "\t\t" + cub[i]);
	    }
	}
 
}