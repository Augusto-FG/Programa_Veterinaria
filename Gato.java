//clase hija
public class Gato extends Mascota implements Maullar{

	private String pulgas, comeRatones;
	
	public Gato(String pulgas, String comeRatones, String nombre, String raza, String color, char sexo) {
		super(nombre, raza, color, sexo);
		this.pulgas= pulgas;
		this.comeRatones= comeRatones;
	}

	public String getPulgas() {
		return pulgas;
	}

	public void setPulgas(String pulgas) {
		this.pulgas = pulgas;
	}

	public String getComeRatones() {
		return comeRatones;
	}

	public void setComeRatones(String comeRatones) {
		this.comeRatones = comeRatones;
	}

	public void traerGetPapa(){
		super.getNombre();
	}
	
	public String toString() {
		 return super.toString()+ "\nPulgas: "+ pulgas + "\nCome ratones: "+ comeRatones;
	}

	@Override
	public void queHaceLaMascota() {
		System.out.println("Soy un gato y yo cazo ratones");
	}
	
	@Override
	public void maullar() {
		System.out.println("Me encanta maullar");
	}

	@Override
	public void romperCortinas() {
		System.out.println("Amo romper las cortinas");
	}	
	
	@Override
	public void accion() {
		this.maullar();
		this.romperCortinas();	
	}
	
}