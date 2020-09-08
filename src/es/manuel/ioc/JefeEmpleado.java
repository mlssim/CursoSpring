package es.manuel.ioc;

public class JefeEmpleado implements Empleados {
	private String email;
	private String nombreEmpresa;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	
	 public String getTareas() {
		 return "Gestiono las cuestiones relativas a mis empleados de sección";
	 }

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentafo por el jefe con arreglos " + informeNuevo.getInforme();
	}

}
