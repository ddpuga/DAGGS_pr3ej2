import java.util.ArrayList;
import java.util.List;

public class TrabajoParallel extends Trabajo {
	
	//Lista de trabajos que hay que paralelizar
	List<Thread> parallelPrograms = new ArrayList<>();

	@Override
	public void run() {
		
		// Se crea y se inicia un hilo por cada programa parelelo
		for (Runnable r: this.programas){
			Thread thread = new Thread(r);
			this.parallelPrograms.add(thread);
			thread.start();
		}
		
		
		// Se espera a que acaben todos los hilos de la lista
		for(Thread t: this.parallelPrograms){
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
	}
	
	}

}
