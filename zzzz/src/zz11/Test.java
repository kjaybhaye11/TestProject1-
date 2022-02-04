package zz11;

interface I1
{
 void play();
}

interface I2
{
	void show();
	}


public class Test implements I1, I2{

	public void play()
	{
		System.out.println("I am palying");
	}
	public void show()
	{System.out.println("I show my new Bike");}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t =new Test();
		t.play();
		t.show();
	}

}
