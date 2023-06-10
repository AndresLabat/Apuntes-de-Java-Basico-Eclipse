package entrega_bootcamp_2;

public class ejercicio_completo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		En este ejercicio practicarás las estructuras de control, para ello deberás crear:

		1) Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
		Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

		2) Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
		el bloque de código que tendrá el bucle deberá:

		- Incrementar el valor de la variable en uno cada vez que se ejecute.

		- Mostrarlo por pantalla cada vez que se ejecute.

		3) Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

		4) Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable 
		sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

		5) Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
		Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
		También habrá que poner un default para cuando el valor de la variable no sea una estación.
		*/
		
		
		System.out.println("PARTE 1");
		
		int numerolf=0;		//VARIABLE A MODIFICAR
		
		if(numerolf < 0) {
			System.out.println("es negativo");
		}else if(numerolf == 0) {
			System.out.println("es cero");
		}else {
			System.out.println("es positivo");
		}


		System.out.println("PARTE 2");
				
		
		int numeroWhile=0;
		
		while(numeroWhile < 3) {
			System.out.print(numeroWhile + " ");
			numeroWhile++;
		}
		

		System.out.println("\nPARTE 3");
				
		int num_repeticiones=0;
		int numeroWhile_1=0;
		
		do {
			if(numeroWhile_1 < 3);
			System.out.println(numeroWhile_1 + " ");
			numeroWhile++;
			
		} while( num_repeticiones == 1);
		

		System.out.println("PARTE 4");
						
		for(int numeroFor=0; numeroFor <= 3; numeroFor++) {
			System.out.print(numeroFor + "\t");
		}
				

		System.out.println("\nPARTE 5");
		
		var estacion="verano";
		
		switch(estacion) {
			case "primavera":
				System.out.println("estamos en primavera");
				break;
			case "verano":
				System.out.println("estamos en verano");	
				break;
			case "otoño":
				System.out.println("estamos en otoño");		
				break;
			case "invierno":
				System.out.println("estamos en invierno");	
				break;
				
		default:
			System.out.println(estacion + " no es una estacion");
			break;
				
		}
		
	}

}
