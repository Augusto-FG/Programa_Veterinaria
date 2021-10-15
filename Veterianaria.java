import java.util.Scanner;

public class Veterianaria {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre,raza,color, pulgas, comeRatones, tamaño, siTieneGarrapatas;
		char sexo;
		int opc, opcion, retorno;
		Mascota m;
		Arreglo arre = new Arreglo();

		
		do{
			
			System.out.println("MENU DE OPCIONES");
			System.out.println("1- AGREGAR MASCOTA");
			System.out.println("2- MOSTRAR DATOS MASCOTAS");
			System.out.println("3- MODIFICAR UN NOMBRE");
			System.out.println("4- SABER QUE HACE MI MASCOTA");
			System.out.println("5- ACCION DE MIS MASCOTAS");
			opcion = lector.nextInt();
			
			switch(opcion){
			
				case 1:
					
					System.out.println("MENU DE MASCOTAS");
					System.out.println("1- Gato");
					System.out.println("2- Perro");
					opcion= lector.nextInt();
					
					if(opcion==1){
						System.out.println("Ingrese el nombre del gato");
						nombre= lector.next();
						
						System.out.println("Ingrese la raza del gato");
						raza= lector.next();
						
						System.out.println("Ingrese el color del gato");
						color= lector.next();
						
						System.out.println("Ingrese el sexo del gato");
						sexo= lector.next().charAt(0);
						
						System.out.println("Tiene pulgas");
						pulgas = lector.next();
						
						System.out.println("Come ratones");
						comeRatones= lector.next();
						
						Gato g = new Gato(pulgas, comeRatones, nombre, raza, color, sexo);
						
						arre.guardarMascota(g);
					}
					
					else{
						System.out.println("Ingrese el nombre del perro");
						nombre= lector.next();
						
						System.out.println("Ingrese la raza del perro");
						raza= lector.next();
						
						System.out.println("Ingrese el color del perro");
						color= lector.next();
						
						System.out.println("Ingrese el sexo del perro");
						sexo= lector.next().charAt(0);
						
						System.out.println("Tamaño");
						tamaño = lector.next();
						
						System.out.println("Si tiene garrapatas");
						siTieneGarrapatas= lector.next();
						
						Perro p = new Perro(tamaño, siTieneGarrapatas, nombre, raza, color, sexo);
						
						arre.guardarMascota(p);
					}			
					break;
						
				case 2: 
						arre.mostrarMascota();
						break;
						
				case 3:
						System.out.println("Ingrese el nombre de la mascota");
						nombre= lector.next();
						retorno=arre.buscarNombreMascota(nombre);
						
						if(retorno==-1){
							System.out.println("Mascota no encontrada");
						}
						else{
							System.out.println("Ingrese nuevo nombre de la mascota");
							nombre= lector.next();
							arre.cambiarNombre(retorno, nombre);
						}	
						break;	
						
				case 4: 
						arre.queHacen();
						break;
						
				case 5:
						arre.acciones();
						break;
						
						
				default:
						System.out.println("Opcion invalida");
			}
			
			System.out.println("Desea continuar en el programa");
			opc= lector.nextInt();	
		}while(opc==1);
		
		
		
		
		
		
		
		
		
		
		
	}
}
