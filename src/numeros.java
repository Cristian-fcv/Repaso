import java.util.Arrays;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] numeros = {250, 100, 23, 145, 122, 432, 107, 109, 265, 194, 1};

        // Ordenamos el arreglo de menor a mayor
        Arrays.sort(numeros);

        // Mostramos los números ordenados
        System.out.println("Números ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        System.out.println("prueba de github");
        System.out.println("prueba de nuevas ramas");

	}

}
