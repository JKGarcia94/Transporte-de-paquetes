import java.util.List;
import java.util.LinkedList;

public class Camioneta extends Vehiculo {

	private List<String> zonas = new LinkedList<String>();

	public boolean agregarZona(String zona) {
		return zonas.add(zona);
	}

	public boolean puedeLlevar(Paquete paquete) {
		boolean paqueteEnZona= this.zonas.contains(paquete.getDestino());
		return paqueteEnZona && puedeCargar(paquete);
		
	}
	
	protected int getCapacidadMaxima() {
		return 2000;
	}

}
