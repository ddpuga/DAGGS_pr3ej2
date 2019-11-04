
public class ProgramD extends Program{
	
  public void concreteRun(){
    try{ 
      System.out.println("[START] Program D"); 
      Thread.sleep(4); 
      System.out.println("[END] Program D"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
}