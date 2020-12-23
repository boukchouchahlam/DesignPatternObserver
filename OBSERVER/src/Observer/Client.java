package Observer;

public class Client {
	 

	private static int i;

	public static void main(String[] args) {
		 Subject subject = new Subject(0);
        
	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
	      new Thread(subject);
	      for ( int i=0 ; i<= 60 ; i++) {
	    	  
 	      System.out.println("State change: "+ i);	
	      int val = i;
		subject.setState(val);}
		
	      
	      

	      
	   }

}
