package t0_3459;

public class CommissionEmployee extends Employee
{
	protected int grossSales;
	protected float commision;
	CommissionEmployee()
	{
		this.grossSales = 0;
		this.commision = 0;
	}
	CommissionEmployee(String fn, String ln, int Id, int GrossSales, float Commision) throws IllegalArgumentException	{
		super(fn, ln, Id);	
		if( GrossSales < 0 || Commision < 0)
			throw new IllegalArgumentException("invalid input");
		this.grossSales = GrossSales;
		this.commision = Commision;
	}
	public int getGrossSales()	{
		return this.grossSales;
	}
	public void setgrossSales(int GrossSales) throws IllegalArgumentException	{
		if(GrossSales < 0)
			throw new IllegalArgumentException("invalid number of Gross Sales");
		this.grossSales = GrossSales;
	}
	public float getcommision()	{
		return this.commision;
	}
	public void setcommision(float Commision) throws IllegalArgumentException	{
		if(Commision < 0)
			throw new IllegalArgumentException("invalid commision size");
		this.commision = Commision;
	}
	public void ToString()	{
		super.ToString();
		System.out.println("numver of grossSales:" +this.grossSales);
		System.out.println("commision:" + this.commision);
	}
	public boolean equals(CommissionEmployee e)	{
		if(this.firstName == e.firstName && this.lastName == e.lastName && this.id == e.id && this.grossSales == e.grossSales && this.commision == e.commision)
			return true;
		return false;
	}
	public float earnings()	{
		return (grossSales*commision)/100;
	}
}
