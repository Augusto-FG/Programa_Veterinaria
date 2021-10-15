public class Arreglo {

	Mascota arreglo[]= new Mascota[100];
	int indice=0;
	
	public void guardarMascota(Mascota m){
		
		if(indice<100){
			arreglo[indice]= m;
			indice++;
			System.out.println("Mascota guardada correctamente");
		}
		else{
			System.out.println("Arreglo lleno, intentelo otro dia");
		}
	}
	
	public void mostrarMascota(){
		for (int i=0; i<indice; i++){
			System.out.println(arreglo[i].toString()+ "\n");
		}
	}
	
	public int buscarNombreMascota(String nombre){
		int posicion=0;
		
		for(int i=0; i<indice; i++){
			if(arreglo[i].getNombre().compareToIgnoreCase(nombre)==0){
				posicion=i;
				return i;
			}
			else{
				posicion=-1;
			}		
		}
		return posicion;
	}
	
	public void cambiarNombre(int posicion, String nombre){
		System.out.println("El nombre viejo es "+ arreglo[posicion].getNombre());
		
		arreglo[posicion].setNombre(nombre);
		
		System.out.println("Nombre modificado correctamente\n");
		
		System.out.println(arreglo[posicion].toString() );
	}
	
	
	public void queHacen(){
		for (int i = 0; i <indice; i++) {
			arreglo[i].queHaceLaMascota();
		}
	}
	
	public void acciones(){
		for (int i = 0; i < indice; i++) {
			arreglo[i].accion();
		}
	}
	
	
	
	
}
