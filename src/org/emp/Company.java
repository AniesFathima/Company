package org.emp;
//child class
public class Company  {
	
	private void daySelection(int day) 
	{
		switch(day) {
		
		case 1:
		{
			System.out.println("monday");
			break;
		}
		
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thrusday");
			break;
		}
				case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		case 7:
		{
			System.out.println("sunday");
			break;
		}
		default:
		{
			System.out.println("no day");
		}}}	
	public static void main(String[] args) {
		Company c = new Company();
		c.daySelection(8);
		
	}
	
	
		
		
	}


	
	
		
	

