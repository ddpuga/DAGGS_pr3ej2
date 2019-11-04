
public class ProgramC extends Program{
	
  public void concreteRun(){
    try{ 
      System.out.println("[START] Program C"); 
      Thread.sleep(10); 
      System.out.println("[END] Program C"); 
    }catch(InterruptedException e){ throw new RuntimeException(e);} 
  } 
}