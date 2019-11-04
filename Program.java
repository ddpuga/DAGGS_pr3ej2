import java.util.Observable;

abstract class Program extends Observable implements Runnable {
	protected boolean end = false;
	protected abstract void concreteRun();
	
	public void run() {
		super.setChanged();
		super.notifyObservers();
		concreteRun();
		end = true;
		super.setChanged();
		super.notifyObservers();
		
	}
	

}
