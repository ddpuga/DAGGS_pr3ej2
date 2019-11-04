import java.util.ArrayList;
import java.util.List;

public class TrabajoBuilder {
	List <Runnable> programas = new ArrayList<>();
	
	private boolean isParalell;
	
	public TrabajoBuilder(boolean isParalell){
		
		this.isParalell = isParalell;
		
	}
	
	//Se añade el programa concreto al trabajo
	public TrabajoBuilder running(Runnable a){
		programas.add(a);
		return this;
	}
	
	//Comprueba si es paralelo y crea un tipo concreto de trabajo
	
	public Trabajo build(){
		
		Trabajo toret;
		
		if(this.isParalell){
			toret = new TrabajoParallel();	
		}else {
			toret = new TrabajoSerial();
		}
		
		
		toret.programas = programas;
		
		return toret;
		
	}
}