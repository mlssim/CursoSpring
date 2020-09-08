package es.manuel.ioc;

public class DirectorEmpleado implements Empleados {

	// Creación de campo tipo CreacionInforme
	private CreacionInformes informeNuevo;
	//Creación constructor de injección de dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la puta plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Creación informe del director: " + informeNuevo.getInforme() ;
	}

}
