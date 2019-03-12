package t0_3459;

public class HourlyEmployee extends Employee
{
	private int hours;
	private float wage;
	HourlyEmployee()	{
		this.hours = 0;
		this.wage = 0;
	}
	HourlyEmployee(String fn, String ln, int Id, int Hours, float Wage) throws IllegalArgumentException	{
		super(fn, ln, Id);
		if( Hours < 0 || Wage < 0)
			throw new IllegalArgumentException("invalid input");
		this.hours =Hours;
		this.wage = Wage;
	}
	public int getHours()	{
		return this.hours;
	}
	public void setHours(int Hours) throws IllegalArgumentException	{
		if(Hours <0)
			throw new IllegalArgumentException("invalid number of hours");
		this.hours = Hours;
	}
	public float getWage()	{
		return this.wage;
	}
	public void setWage(float Wage) throws IllegalArgumentException	{
		if(Wage < 0)
			throw new IllegalArgumentException("invalid wage size");
		this.wage = Wage;
	}
	public void ToString()	{
		super.ToString();
		System.out.println("number of hours:" +this.hours);
		System.out.println("wage:" + this.wage);
	}
	public boolean equals(HourlyEmployee e)	{
		if(this.firstName == e.firstName && this.lastName == e.lastName && this.id == e.id && this.hours == e.hours && this.wage == e.wage)
			return true;
		return false;
	}
	public float earnings()	{
		return hours*wage;
	}
	
}
