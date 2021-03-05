import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		Scanner in =  new  Scanner (System.in);
        int multiplicando, inicio, fim;

        System.out.println("Multiplicando:  "); 
        multiplicando = in.nextInt();
        
        System.out.println("Início de um intervalo: ");
        inicio = in.nextInt();
        
        System.out.println("Fim do intervalo: ");
        fim = in.nextInt();

        if (multiplicando <  0  || multiplicando >  5000 ){
        	System.out.println ( " O multiplicando não pode ser negativo e não pode ser maior que 5000 " );
        }
        
        else  if (inicio <  0  || inicio >  5000 ) {
        	System.out.println ( " O início do intervalo, não pode ser número negativo e não pode ser maiores de 5000 " );
        } 
        
        else  if (fim <  0  || fim >  5000 ) {
        	System.out.println( " O início do intervalo, não pode ser número negativo e não pode ser maiores de 5000 " );
        } 
        
        else  if (inicio >= fim) {
        	System.out.println ( " O fim não pode ser menor do que o início. " );
        } 
        
        else  if (fim - inicio >=  10 ) {
        	System.out.println ( " O intervalo não pode ter uma diferença maior que 10 " );
        } 
        
        else {
        for ( int i = inicio; i <= fim; i ++ ) {
            	System.out.println (multiplicando +  " x "  +  i  +  " = "  + (multiplicando * i));
        }
        }

	}

}
