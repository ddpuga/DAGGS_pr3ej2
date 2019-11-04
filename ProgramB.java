
public class ProgramB extends Program{
	
	
	public void concreteRun(){
    try{ 
      System.out.println("[START] Program B"); 
      Thread.sleep(10); 
      System.out.println("[END] Program B"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  }
}