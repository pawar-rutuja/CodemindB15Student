package javapractice;

class Electronics
{
	String ItemName;
	int Price= 40000;
	String Model;
	
	public void functions()
	{
		System.out.println(" We are habbited to use Electonics each time");
	}
	
}

class Laptop extends Electronics
{
	String color= "Black";
	int Display;
	
	public void Work()
	{
		System.out.println("Dell Laptops are widely used");
	}
		
}

class Camera extends Electronics
{
	String Brand;
	String Type;
	int MRP;
	
	public void Recording()
	{
		System.out.println("Beautiful Pictures Click by Camera ");
		System.out.println("Cameramen Used advance model to record wedding");
	}
	
}

class TV extends Electronics
{
	float Size;
	String Version;
	String BrandName;
	
	public void Watching()
	{
		System.out.println(" I Like to watch Movies ");
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
	
		TV tv=new TV();
		tv.functions();
		tv.Watching();
		
		
		Laptop Lp= new Laptop();
		Lp.Work();
		System.out.println("My Laptop Color Is " + Lp.color);
	
		Camera Cm=new Camera();
		Cm.Recording();
		System.out.println("Camera Price Is " + Cm.Price);
		Cm.functions();
		
		

	}

}
