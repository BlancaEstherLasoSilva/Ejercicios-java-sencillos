import java.util.InputMismatchException;
import java.util.Scanner;

public class HorarioExtraescolar {

	public static void main(String[] args) {
		        Scanner sn = new Scanner(System.in);
		       
		        int opcion;
		        String actividad;
		        boolean salir = false;
		       
		        while (!salir){
		     
		        
		           
		            System.out.println("1.- Lunes");
		            System.out.println("2.- Martes");
		            System.out.println("3.- Miércoles");
		            System.out.println("4.- Jueves");
		            System.out.println("5.- viernes");
		            System.out.println("6.- Sabado");
		            System.out.println("7.- Domingo");
		            System.out.println("8.-Salir");
		            try{
		                
		                System.out.println("Seleccione la opcion deseada: ");
		                opcion = sn.nextInt();
		            switch (opcion){
		                case 1:
		                    System.out.println("psicomotricidad");
		                    break;
		                case 2:
		                    System.out.println("natación");
		                    break;
		                case 3:

		                    System.out.println("musica");
		                    break;
		                case 4:

		                    System.out.println("natación");
		                    break;
		                case 5:

		                    System.out.println("Descanso");
		                    break;
		                case 6:

		                    System.out.println("\033[31m Día sin actividades");
		                    break; 
		                case 7:

		                    System.out.println("\033[31m Día sin actividades");
		                    break; 
		                case 8:
		                	salir=true;
		                    break;
		                default:   
		                   System.out.println("Día erróneo");
		                   break;
		            }
		            }
		            catch(InputMismatchException e){
		                System.out.println("Debes seleccionar un numero de opcion");
		                sn.next();
		            }
		    }
		   
		                System.out.println("Gracias por utilizar el sistema, hasta luego... ");
		}
		}   
		            
		      

		               
		       

