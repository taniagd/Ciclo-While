import java.util.Scanner;
public class EjercicioCicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que pida dos n�meros por consola de manera reiterada.
		 * La ejecuci�n del programa terminar� cuando los n�meros ingresados sean iguales
		 * Nota. Utilizar un ciclo while*/
		
		Scanner readNumbers = new Scanner (System.in);
		int numberOne = 0;
		int numberTwo = 1;
		
		
		
		while (numberOne != numberTwo) {
			System.out.println("Introduce un n�mero entero, por favor");
			numberOne=readNumbers.nextInt();
			System.out.println("Introduce otro n�mero entero, por favor");
			numberTwo=readNumbers.nextInt();
			
		}
		System.out.println("�Al fin tus n�meros son iguales");
		readNumbers.close();
	}
	
}