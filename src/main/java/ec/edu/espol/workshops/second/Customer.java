package ec.edu.espol.workshops.second;

public class Customer {
	public static final int MaxEdad=80;   /** Maxima edad*/
	public static final int MinEdad=18;   /** Edad minima*/
	String sexo;            /** Genero de la persona*/
	String licencia;
	boolean casado;
	int edad;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getLicencia() {
		return this.licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Customer(int edad, String sexo, String licencia, boolean casado) {
		if(edad > MaxEdad || edad < MinEdad) {
			System.out.println("Imprimir no valido");
		}else {
			this.edad= edad;
			this.sexo=sexo;
			this.licencia=licencia;
			this.casado=casado;
		}
	}
	public boolean validar() {
		return this.edad<MaxEdad && this.licencia.length()==9;
	}
	
	
}
