import java.util.Observable;
import java.util.Observer;

public class ProgramObserver implements Observer {
	private int numProgram=0;

	@Override
	public void update(Observable obs, Object args) {
		Program observed = (Program)obs;
		int aux;
		if(observed.end) {
			aux = -1;
		}else {
			aux = 1;
		}
		
		numProgram += aux;
		if(aux==1) {
		System.out.println("Creado un programa. Actualmente hay " + numProgram + " en curso");
		}else {
		System.out.println("Finalizado un programa. Actualmente hay " + numProgram + " en curso");
		}
	}

}
