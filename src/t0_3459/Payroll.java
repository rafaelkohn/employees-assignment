package t0_3459;

import java.util.Scanner;

public class Payroll {
	public static int getinputint()	{
		Scanner myVar = new Scanner(System.in);
		int input = myVar.nextInt();
		return input;
	}
	public static String getinputstring()	{
		Scanner myVar = new Scanner(System.in);
		String input = myVar.nextLine();
		return input;
	}
	public static float getinputfloat() {
		Scanner myVar = new Scanner(System.in);
		float input = myVar.nextFloat();
		return input;
	}

	public static void main(String[] args) {
		try		{
			// input receiving process:
			
			String[] fn = new String[3];
			String[] ln = new String[3];
			int[] id =new int[3];
			int[] grosssales = new int[2];
			float[] commision = new float[2];
			int hours; float wage; float baseSalary;
			for(int i=0; i<3; i++)	{
				System.out.println("please enter your employee's first and last names and his id");
				fn[i] = getinputstring();
				ln[i] = getinputstring();
				id[i] = getinputint();
			}
			System.out.println("please enter your employee's number of weekly hours and his wage");
			hours = getinputint();
			wage = getinputfloat();
			for(int i=0;i<2;i++)	{
				System.out.println("please enter your employee's number of gross sales and his commision");
				grosssales[i] = getinputint();
				commision[i] = getinputfloat();
			}
			System.out.println("and his base salary:");
			baseSalary = getinputfloat();			
			
			Employee[] arr = new Employee[3];
			arr[0] = new HourlyEmployee( fn[0] , ln[0] , id[0] , hours , wage );
			arr[1] = new CommissionEmployee( fn[1] , ln[1] , id[1] , grosssales[0] , commision[0] );
			arr[2] = new BasePlusCommissionEmployee( fn[2] , ln[2] , id[2] , grosssales[1] , commision[1], baseSalary );
			for(int i=0;i<3;i++)
			{
				arr[i].ToString();
				if(i==2)
					System.out.println(1.1*arr[i].earnings());
				else
					System.out.println(arr[i].earnings());
			}
		}
		catch(Exception e)	{
			System.out.println("An Error occurred");
		}
	}

}
