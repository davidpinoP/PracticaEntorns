package PracticaEntorns;

public class PracticaEntorns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		int resulSuma = 0;
		// User 1 fer la suma dels elements de sumArray
		
		for (int i = 0; i < subArray.length; i++) {
			resulSuma += sumArray[i];
		} System.out.println("El resultado de la suma es: " + resulSuma);
		
		
		// User 2 fer la resta dels elements de subArray
		
		 int subResult = subArray[0];  // Comenzamos con el primer elemento
	        for (int i = 1; i < subArray.length; i++) {
	            subResult -= subArray[i];  // Restamos cada elemento subsecuente
	        }
	        System.out.println("Resta de los elementos en subArray: " + subResult);
	    }
	
		
		
		
		// User 3 fer la multiplicació dels elements de prodArray
	}


