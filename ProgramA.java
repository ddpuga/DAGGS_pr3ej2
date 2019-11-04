
public class ProgramA extends Program{
	
	boolean end = false;
	
  public void concreteRun(){
    try{ 
      System.out.println("[START] Program A"); 
      Thread.sleep(10); 
      System.out.println("[END] Program A"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
}