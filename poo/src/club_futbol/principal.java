//package club_futbol;
//import java.util.*;
//
//public class principal {
//
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//		Club club = new Club();
//		Persona director_tecnico = new Persona();
//		ArrayList<Jugador> jugadores;
//		ArrayList<Domilicio> jugadores_domicilio;
//		char status;
//		
//		// Seteo de los objetos
//		System.out.println("Ingrese nombre del club: ");
//		club.setNombre(scan.nextLine());
//		System.out.println("Ingrese color del club: ");
//		club.setColor(scan.nextLine());
//		System.out.println("Ingrese el nombre del director tecnico del club: ");
//		director_tecnico.setNombre(scan.nextLine());
//		System.out.println("Ingrese el apellido del director tecnico del club");
//		director_tecnico.setApellido(scan.nextLine());
//		club.setDirector_tecnico(director_tecnico);
//		System.out.println("Cantidad de socios del club: ");
//		club.setCant_socios(scan.nextInt());
//
//		System.out.println("Desea ingresar jugadores? <y/n>");
//		status = scan.nextLine().charAt(0); 
//		while(status == 'y') {
//			System.out.println("Ingrese nombre del jugador ");
//			String jugador_club = scan.nextLine();
//			club.getJugadores().add(jugador_club);
//			club.getJugadores().add(new Jugador());
//			System.out.println("Ingrese el apellido del jugador " + (i+1));
//			jugadores[i].setApellido(scan.next());
//			System.out.println("Ingrese el dni del jugador " + (i+1));
//			jugadores[i].setDni(scan.next());
//			System.out.println("Ingrese la edad del jugador " + (i+1));
//			jugadores[i].setEdad(scan.nextInt());
//			System.out.println("Ingrese la provincia del jugador " + (i+1));
//			jugadores_domicilio[i].setProvincia(scan.next());
//			System.out.println("Ingrese el barrio del jugador " + (i+1));
//			jugadores_domicilio[i].setBarrio(scan.next());
//			System.out.println("Ingrese la calle del jugador " + (i+1));
//			jugadores_domicilio[i].setCalle(scan.next());
//			System.out.println("Ingrese el numero del jugador " + (i+1));
//			jugadores_domicilio[i].setNumero(scan.nextInt());
//			jugadores[i].setDomicilio(jugadores_domicilio[i]);
//			System.out.println("Ingrese el puesto del jugador " + (i+1) );
//			jugadores[i].setPosicion(scan.nextInt());
//			System.out.println("Ingrese el salario del jugador " + (i+1));
//			jugadores[i].setSalario(scan.nextInt());
//			
//			System.out.println("Desea ingresar jugadores? <y/n>");
//			status = scan.nextLine().charAt(0); 
//		}
//		
//		club.setJugadores(jugadores);
//		
//		
//		// Club
//		
//		club.mostrar_info();
//		club.jugar_partido();
//		System.out.println("");
//		System.out.println("");
//		club.mostrar_jugadores();
//		System.out.println("");
//		System.out.println("");
//		
//		for (int i = 0 ; i < jugadores.length ; i++) {
//			jugadores[i].mostrar_info();
//			System.out.println("");
//			System.out.println("");
//		}
//		
//		for (int i = 0; i < jugadores.length ; i++) {
//			jugadores[i].mostrar_jugador();
//			System.out.println("");
//			System.out.println("");
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
