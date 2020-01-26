class A
{
	public void greetings(String msg)
	{
		System.out.println(msg);
	}
}
class B extends A
{
	//@Override
	public void greetings(String msg)
	{
		System.out.println(msg);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		B b=new  B();
		b.greetings("Hello"); 
		A a=new A();
		a.greetings("hi");
		
		A c=new  B();
		c.greetings("Wel Come"); 
	//B d=new A();// can not be used from a to b
		//d.greetings("hi");
		

	}

}
