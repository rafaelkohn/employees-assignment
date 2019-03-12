package t0_3459;

public class BasePlusCommissionEmployee extends CommissionEmployee 
{
	float baseSalary;
	BasePlusCommissionEmployee()	{
		baseSalary = 0;
	}
	BasePlusCommissionEmployee(String fn, String ln, int Id, int GrossSales, float Commision, float BaseSalary)throws IllegalArgumentException	{
		super(fn, ln, Id, GrossSales, Commision);
		if(baseSalary < 0)
			throw new IllegalArgumentException("invalid input");
		this.baseSalary = BaseSalary;
	}
	public float getBaseSalary()
	{
		return this.baseSalary;
	}
	public void setBaseSalary(float bs)throws IllegalArgumentException	{
		if(bs < 0)
			throw new IllegalArgumentException("invalid base salary size");
		this.baseSalary = bs;
	}
	public void ToString()	{
		super.ToString();
		System.out.println("baseSalary:" + this.baseSalary);
	}
	public boolean equals(BasePlusCommissionEmployee e)	{
		if(this.firstName == e.firstName && this.lastName == e.lastName && this.id == e.id && this.grossSales == e.grossSales && this.commision == e.commision && this.baseSalary == e.baseSalary)
			return true;
		return false;
	}
	public float earnings()	{
		return (grossSales*commision)/100+baseSalary;
	}
}
