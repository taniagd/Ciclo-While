import java.util.Scanner;
public class EjercicioCicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que pida dos números por consola de manera reiterada.
		 * La ejecución del programa terminará cuando los números ingresados sean iguales
		 * Nota. Utilizar un ciclo while*/
		
		Scanner readNumbers = new Scanner (System.in);
		int numberOne = 0;
		int numberTwo = 1;
		
		
		
		while (numberOne != numberTwo) {
			System.out.println("Introduce un número entero, por favor");
			numberOne=readNumbers.nextInt();
			System.out.println("Introduce otro número entero, por favor");
			numberTwo=readNumbers.nextInt();
			
		}
		System.out.println("¡Al fin tus números son iguales");
		readNumbers.close();
	}
	
}