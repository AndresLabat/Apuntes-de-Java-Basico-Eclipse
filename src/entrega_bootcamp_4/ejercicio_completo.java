package entrega_bootcamp_4;

public class ejercicio_completo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Crea una clase Persona con las siguientes variables:

			- La edad

			- El nombre

			- El teléfono

		Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable 
		credito solo para esa clase.

		Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
		tienes que darles valor y mostrarlas por pantalla.

		Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga
		la clase Trabajador.
		 */

		
		Cliente cliente = new Cliente();
		
		cliente.setEdad(25);
		System.out.println(cliente.getEdad());
		
		cliente.setNombre("Mario");
		System.out.println(cliente.getNombre());
		
		cliente.setTelefono(666777888);
		System.out.println(cliente.getTelefono());
		
		cliente.setCredito(8000);
		System.out.println(cliente.getCredito());
		
		
		
		Trabajador trabajador = new Trabajador();
		
		trabajador.setEdad(30);
		System.out.println(trabajador.getEdad());
		
		trabajador.setNombre("Jose");
		System.out.println(trabajador.getNombre());
		
		trabajador.setTelefono(666555444);
		System.out.println(trabajador.getTelefono());
		
		trabajador.setSalario(1600);
		System.out.println(trabajador.getSalario());
		
		
		
	}

}

	class Persona{
		
		int edad;
		String nombre;
		int telefono;
		
		public Persona(){		//		AÑADO UN CONSTRUCTOR PARA QUE SEA MAS FACIL DISTINGUIR EN LA CONSOLA A QUIEN PERTENECEN LOS DATOS
			System.out.println("\nLOS DATOS QUE TENEMOS SON LOS SIGUIENTES:");
		}
		
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public String getEdad() {
			return "la edad de esta persona es " + edad;
		}		
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return "el nombre de esta persona es " + nombre;
		}
		
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
		public String getTelefono() {
			return "el telefono de esta persona es " + telefono;
		}
		
				
	}
	
	class Cliente extends Persona{
		
		int credito;
		
		public void setCredito(int credito) {
			this.credito = credito;
		}
		
		public String getCredito() {
			return "el credito de este cliente es " + credito;
		}
		
	}
	
	class Trabajador extends Persona{
		
		int salario;		
		
		public void setSalario(int salario) {
			this.salario = salario;
		}
		
		public String getSalario() {
			return "el salario de este trabajador es " + salario;
		}
		
		
	}
