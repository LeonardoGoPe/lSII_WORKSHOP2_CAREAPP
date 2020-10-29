package ec.edu.espol.workshops.second;

public class Customer {
	public static final int MaxEdad=80;
	public static final int MinEdad=18;
	String sexo,licencia;
	boolean Casado;
	int edad;
	
	public Customer(int edad, String sexo, String licencia, boolean Casado) 
	{
		if(edad>MaxEdad || edad< MinEdad) {
			System.out.println("Imprimir no valido");
		}else {
			this.edad= edad;
			this.sexo=sexo;
			this.licencia=licencia;
			this.Casado=Casado;
		}
	}
	public boolean Validar() {
		return this.edad<MaxEdad && this.licencia.length()==9;
	}
	//getter setters 
	
}
