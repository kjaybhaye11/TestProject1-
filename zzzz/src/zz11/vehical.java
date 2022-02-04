package zz11;

abstract class BigVehical{
	
	BigVehical()
	{
		System.out.println("India");
	}
	abstract void start();
	void ride()
	{System.out.println("oif the record");}
}


    class Car extends BigVehical{
    	
    	void start()
    	{
    		System.out.println("Car is new");
    	}
    }
public class vehical extends BigVehical{

	   void start()
	   {
		   System.out.println("Hello");
	   }
	   
	   public static void main(String args [])
	   {
		   
		   Car c =new Car();
		   c.start();
		   c.ride();
		  
		  // BigVehical v =new BigVehical();
		  
		   
	   }
	
}
