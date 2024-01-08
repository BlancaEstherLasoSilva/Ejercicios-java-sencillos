  import java.io.*;

  public class CalculadoraEuros
  {
    public static void main( String[] args ) throws Exception
    {
    	BufferedReader teclado;
	       long pesetas;
	       double euros;
	       String linea;

	       teclado = new BufferedReader( new InputStreamReader(System.in) );

	       System.out.print("Cantidad en pesetas: ");
	       linea = teclado.readLine();
	       pesetas = Integer.parseInt(linea);
	       if (pesetas<=0) {
	    	   System.out.print("El valor de pesetas introducido no es valido");
	       }else {
	       euros = pesetas/166.386;
	       System.out.println(pesetas+" pesetas son "+euros+" euros.");
	}
	}
}
