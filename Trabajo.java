import java.util.List;

public abstract class Trabajo implements Runnable {
	List<Runnable> programas;
	
	public void addTrabajo(Runnable tr){
		Thread thread = new Thread(tr);
		this.programas.add(thread);
	}
	
}