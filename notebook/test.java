import mypack1.demo;
import mypack1.demo2;
import mypack1.inner.demo3;

public class test
{
	static public void main(String args[])
	{
		demo d1=new demo();
		d1.display();
		demo2 d2=new demo2();
		d2.display();
		demo3 d3=new demo3();
		d3.display();
	}
}