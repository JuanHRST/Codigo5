import java.util.Scanner; //Se agrego el Scanner
//Contar si tiene mas (3, 7, 8, 9) que los numeros (1, 2, 4, 5, 6, 0)
public class Codigo5 {
	public static void main(String[] args) { //Se agregó el public static void main
		 Scanner s = new Scanner(System.in); // Se agrego System.in

		System.out.print("Introduzca un número: ");
		int ni = s.nextInt(); //Se cambio el tipo de dato de String a Integer
		int c = ni; 
		
		int afo = 0;
		int noAfo = 0;

		while (ni > 0) {
			int digito = (int) (ni % 10);
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
			}
			ni /= 10; //Se movió esta linea fuera del else
			}

			if (afo > noAfo) {
				System.out.println("El " + c + " es un número afortunado."); //se agrego "t" en el syso
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
			}

	}
}