package t0_3459;

abstract public class Employee {
	protected String firstName;
	protected String lastName;
	protected int id;
	Employee(String fn, String ln, int tz) throws IllegalArgumentException	{
		if(namechecker(fn)&&namechecker(ln)&&tz>=0)
		{
			this.firstName = fn;
			this.lastName = ln;
			this.id = tz;
		}
		else
			throw new IllegalArgumentException("invalid input");
	}
	Employee()	{
		this.firstName = "plony";
		this.lastName = "almony";
		this.id = 0;
	}
	public String getFistName()	{
		return this.firstName;
	}
	public void setFistName(String fn)throws IllegalArgumentException	{	
		if(!namechecker(fn))
				throw new IllegalArgumentException("invalid name");
		this.firstName = fn;
	}
	public String getLastName()	{
		return this.lastName;
	}
	public void setLastName(String ln)	{
		if(!namechecker(ln))
			throw new IllegalArgumentException("invalid name");
		this.lastName = ln;
	}
	public int getId()	{
		return this.id;
	}
	public void setId(int ID) throws IllegalArgumentException	{
		if(ID <0)
			throw new IllegalArgumentException("invalid id");
		this.id = ID;
	}
	public void ToString()	{
		System.out.println("first name:" +this.firstName);
		System.out.println("last name:" + this.lastName);
		System.out.println("id:" + this.id);
	}
	public boolean equals(Employee e)	{
		if(this.firstName == e.firstName && this.lastName == e.lastName && this.id == e.id)
			return true;
		return false;
	}
	abstract public float earnings();
	
	//checks if the name parameters are valid
	private boolean namechecker(String str) {
		for(int i=0;i<str.length();i++)
			if(!((str.charAt(i)<='z'&&str.charAt(i)>='a')||(str.charAt(i)<='Z' && str.charAt(i)>='A')))
				return false;
		return true;
	}
}
