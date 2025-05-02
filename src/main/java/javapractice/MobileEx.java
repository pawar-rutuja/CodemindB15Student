package javapractice;

public class MobileEx
{
	
	String Model;
	String Color;
	int Price;

	
	public MobileEx(String Model,String Color,int Price) {
		this.Model=Model;
		this.Color=Color;
		this.Price=Price;
	}
		
  public void Calling()
  {
	  System.out.println("Calling");
	  
	  System.out.println(Model);
	  System.out.println(Color);
	  System.out.println(Price);
	  
  }
  
  public void Message()
  {
	  System.out.println("Message received");
	
  }

  public static void main(String args[])
  {
	  MobileEx Mb=new MobileEx("Samsung","Black",75000);
	 System.out.println(Mb.Model);
	 Mb.Calling();
  }
  
}
  