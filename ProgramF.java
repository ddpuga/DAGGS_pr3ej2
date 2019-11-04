
public class ProgramF extends Program{
	
  public void concreteRun(){
    try{ 
      System.out.println("[START] Program F"); 
      Thread.sleep(10); 
      System.out.println("[END] Program F"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
}