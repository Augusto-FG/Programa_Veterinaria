//clase padre
public abstract class Mascota {

	private String nombre, raza, color;
	private char sexo;
	
	public Mascota(String nombre, String raza, String color, char sexo) {
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nRaza: " + raza + "\nColor: " + color + "\nSexo: " + sexo;
	}
	
	public abstract void queHaceLaMascota();
	
	public abstract void accion();
	
		
	
	
}
