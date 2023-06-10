package practica_orientada_a_objetos6_interfaz_como_baseDeDatos;

import java.util.List;

public interface IntefazEmpleadoCRUD {
	
	//	se declaran los metodos
	
	void save(Empleado empleado);
	
	List<Empleado> findAll();
	
	void delete(Empleado empleado);

}
