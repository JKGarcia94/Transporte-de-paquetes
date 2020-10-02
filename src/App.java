import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Vehiculo> vehiculos = new LinkedList<Vehiculo>();
		vehiculos.add(new Bicicleta("Moron"));
		Camioneta camioneta = new Camioneta();
		camioneta.agregarZona("Castelar");
		camioneta.agregarZona("Haedo");
		vehiculos.add(camioneta);

		List<Paquete> paquetes = new LinkedList<Paquete>();
		paquetes.add(new Paquete("Haedo", 150));
		paquetes.add(new Paquete("Castelar", 50));
		paquetes.add(new Paquete("Moron", 15));

		Logistica.organizar(vehiculos, paquetes);
		System.out.println(vehiculos);
	}

	
	
}
