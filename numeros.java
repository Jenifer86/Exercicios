import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		Scanner in =  new  Scanner (System.in);
        int multiplicando, inicio, fim;

        System.out.println("Multiplicando:  "); 
        multiplicando = in.nextInt();
        
        System.out.println("In�cio de um intervalo: ");
        inicio = in.nextInt();
        
        System.out.println("Fim do intervalo: ");
        fim = in.nextInt();

        if (multiplicando <  0  || multiplicando >  5000 ){
        	System.out.println ( " O multiplicando n�o pode ser negativo e n�o pode ser maior que 5000 " );
        }
        
        else  if (inicio <  0  || inicio >  5000 ) {
        	System.out.println ( " O in�cio do intervalo, n�o pode ser n�mero negativo e n�o pode ser maiores de 5000 " );
        } 
        
        else  if (fim <  0  || fim >  5000 ) {
        	System.out.println( " O in�cio do intervalo, n�o pode ser n�mero negativo e n�o pode ser maiores de 5000 " );
        } 
        
        else  if (inicio >= fim) {
        	System.out.println ( " O fim n�o pode ser menor do que o in�cio. " );
        } 
        
        else  if (fim - inicio >=  10 ) {
        	System.out.println ( " O intervalo n�o pode ter uma diferen�a maior que 10 " );
        } 
        
        else {
        for ( int i = inicio; i <= fim; i ++ ) {
            	System.out.println (multiplicando +  " x "  +  i  +  " = "  + (multiplicando * i));
        }
        }

	}

}
