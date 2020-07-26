package logger;


import java.util.Scanner;
import java.util.logging.Logger; 

public class ConstructionLogger
{
	static
	{
		Logger log=Logger.getLogger(ConstructionLogger.class.getName());
		Scanner s=new Scanner(System.in);
		int area,choice;
		String logMessage;
		log.info("Select Material Quality\n1.standard\n2.Above standard\n3.High standard\n4.High standard and Fully automated home");
		choice=s.nextInt();
		if(choice==1||choice==2||choice==3||choice==4)
		{
			log.info("Enter the Area of the house in sq.ft");
			area=s.nextInt();
			Construction con= new Construction(choice,area);
			logMessage=con.costCalculation();
			log.info(logMessage);
		}
		else
		{
			log.info("Invalid input");
			System.exit(0); 
		}
		s.close();
    System.exit(0);
	}

	public static void main(String[] args)
	{
	}

}

public class Construction
{
	int standard,Area;
	Construction(int std,int area)
	{
		standard=std;
		Area=area;
	}
	String costCalculation()
	{
		if(standard==1)
			return("Construction Cost is: "+Area*12000);
		else if(standard==2)
			return("Construction Cost is: "+Area*15000);
		else if(standard==3)
			return("Construction Cost is:"+Area*18000);
		else if(standard==4)
			return("Construction Cost is:"+Area*25000);
		else
			return("Invalid");
	}
}