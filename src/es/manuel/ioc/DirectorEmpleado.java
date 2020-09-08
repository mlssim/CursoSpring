package es.manuel.ioc;

public class DirectorEmpleado implements Empleados {

	// Creaci�n de campo tipo CreacionInforme
	private CreacionInformes informeNuevo;
	//Creaci�n constructor de injecci�n de dependencia
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
		return "Creaci�n informe del director: " + informeNuevo.getInforme() ;
	}

}
