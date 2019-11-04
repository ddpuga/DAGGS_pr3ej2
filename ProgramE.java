
public class ProgramE extends Program{
	
  public void concreteRun(){
    try{ 
      System.out.println("[START] Program E"); 
      Thread.sleep(10); 
      System.out.println("[END] Program E"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
}