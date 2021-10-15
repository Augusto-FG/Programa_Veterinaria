public class Perro extends Mascota implements Jugar {

	private String tama�o, siTieneGarrapatas;
	
	public Perro(String tama�o, String siTieneGarrapatas, String nombre, String raza, String color, char sexo) {
		super(nombre, raza, color, sexo);
		this.tama�o= tama�o;
		this.siTieneGarrapatas= siTieneGarrapatas;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getSiTieneGarrapatas() {
		return siTieneGarrapatas;
	}

	public void setSiTieneGarrapatas(String siTieneGarrapatas) {
		this.siTieneGarrapatas = siTieneGarrapatas;
	}
	
	public String toString() {
		 return super.toString()+ "\nTama�o: "+ tama�o + "\nSi tiene pulgas: "+ siTieneGarrapatas;
	}
	//METODO POLIMORFICO HERADADO DE LA CLASE MASCOTA
	@Override
	public void queHaceLaMascota() {
		System.out.println("Soy un perro y yo ladro");
	}

	//METODOS ABSTRACTOS IMPLEMENTADOS DESDE LA INTERFAZ JUGAR
	@Override
	public void perseguirCola() {
		System.out.println("Me encanta perseguir mi colita");
		
	}

	@Override
	public void buscarPelota() {
		System.out.println("Me encanta buscar la pelota en el parque");
		
	}

	@Override
	public void accion() {
		this.buscarPelota();
		this.perseguirCola();
		
	}
	
	
	
}
