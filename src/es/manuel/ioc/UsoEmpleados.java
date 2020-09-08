package es.manuel.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Creación objeto tipo empleado
			//	Empleados Empleado1=new DirectorEmpleado();
				
		
		
			// Uso de objetos tipo empleado
			//	System.out.println(Empleado1.getTareas());
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SecretarioEmpleado Victoria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println(Victoria.getInforme());
		System.out.println(Victoria.getTareas());
		System.out.println(Victoria.getEmail());
		System.out.println(Victoria.getNombreEmpresa());
		
		contexto.close();
		
	}

	
	

}
