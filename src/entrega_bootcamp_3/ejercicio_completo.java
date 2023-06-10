package entrega_bootcamp_3;

public class ejercicio_completo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Para practicar la encapsulación:

			- Crear clase Persona.

			- Crear las variables privadas edad, nombre y telefono de la clase Persona.

			- Crear gets y sets de cada propiedad.

			- Crear un objeto persona en el main.

			- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola
		 */

		
		persona persona = new persona();
		
		persona.setEdad(25);		
		System.out.println(persona.getEdad());
		
		persona.setNombre("Jorge");
		System.out.println(persona.getNombre());
		
		persona.setTelefono(666555444);
		System.out.println(persona.getTelefono());
		
		
	}

}

	class persona {
		
		private int edad;
		private String nombre;
		private int telefono;
		
	public void setEdad(int edad) {		//	SETTER
		this.edad = edad;
	}
	
	public String getEdad() {
		return "esta persona tiene " + edad + " años.";		//	GETTER
	}
	
	public void setNombre(String nombre) {		//	SETTER
		this.nombre = nombre;
	}
	
	public String getNombre() {		//	GETTER
		return "su nombre es " + nombre;
	}
	
	public void setTelefono(int telefono) {		//	SETTER
		this.telefono = telefono;		
	}
	
	public String getTelefono() {		//	GETTER
		return "su numero de telefono es " + telefono;
	}
	
	
		
	}
