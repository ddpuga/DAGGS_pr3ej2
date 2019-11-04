import java.util.Observer;

public class Client {
	
	public static void main(String args[]) {
		Observer observer = new ProgramObserver();
		
		Program a = new ProgramA();
		a.addObserver(observer);
		Program b = new ProgramB();
		b.addObserver(observer);
		Program c = new ProgramC();
		c.addObserver(observer);
		Program d = new ProgramD();
		d.addObserver(observer);
		Program e = new ProgramE();
		e.addObserver(observer);
		Program f = new ProgramF();
		f.addObserver(observer);
	
		//A y E son trabajos serie con un solo programa, DF es un trabajo serie dentro del paralelo BCDF
		Trabajo prA = new TrabajoBuilder(false).running(a).build();
		Trabajo prDF = new TrabajoBuilder(false).running(d).running(f).build();
		Trabajo prBCDF = new TrabajoBuilder(true).running(prDF).running(b).running(c).build();
		Trabajo prE = new TrabajoBuilder(false).running(e).build();
		
		//Junta todos los trabajos creados antes en un trabajo serie
		Trabajo runall = new TrabajoBuilder(false).running(prA).running(prBCDF).running(prE).build();
		
		runall.run();
		
		
		
		
	}

}
