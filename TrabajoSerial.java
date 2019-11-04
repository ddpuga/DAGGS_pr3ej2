
public class TrabajoSerial extends Trabajo {

	//Se ejecutan en orden cada uno de los programas almacenados para ejecutar en serie
	public void run() {
		for (Runnable r : this.programas) {
			r.run();
		}	
	}

}
