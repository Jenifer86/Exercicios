import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		 Scanner ent = new Scanner(System.in);
		 double numero, soma = 0;
	                
	        do{
	            System.out.println("Digite um n�mero:");
				numero = ent.nextDouble();
	            
	            if(numero >= 0){ 
	                soma = numero + soma; 
	            }
	        } while(numero >= 0|| numero<157); 
	        
	        System.out.println("A soma �: " + soma); 
			}
		}
		



