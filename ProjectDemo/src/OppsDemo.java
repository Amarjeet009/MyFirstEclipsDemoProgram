
public class OppsDemo {
            
	int id;
	String Name;
	static String Batch="CSE";
	static String College="Vits";
	int age;
	
	OppsDemo(int id, String Name,int age)
	{
		this.id=id;
		this.Name=Name;
		this.age=age;
		
	}
	
	void display()
	{
		System.out.println("Student id ="+id+"\t Student Name= "+Name+"\t Student Batch ="+Batch+"\t College = "+College+"\n Age = "+age);
	}
	
	public static void main(String []args)
	{
	   	OppsDemo obj=new OppsDemo(1111,"Amarjeet",23);
		OppsDemo obj1=new OppsDemo(1222,"Ankit",22);
		OppsDemo obj2=new OppsDemo(1333,"Shubhi",23);
		obj.display();
		obj1.display();
		obj2.display();
	}
}
