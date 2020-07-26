import java.util.*;
import java.util.logging.Logger; 

public class Interest
{
    static
    {
		Scanner s = new Scanner(System.in);
		Logger logger=Logger.getLogger(Interest.class.getName());
		
		System.out.format("%s", "Enter principle amount");
		double principle = s.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rate_of_interest = s.nextDouble();
		System.out.format("%s", "Enter number of years");
		double time = s.nextDouble();
		
		ComputeInterest com = new ComputeInterest(principle, rate_of_interest, time);
		
		logger.info("Select 1. Simple Interest \n2. Compound Interest \n3.Both");
		int choice = s.nextInt();
		
		switch (choice)
		{
		    case 1:
			    logger.info(String.valueOf(com.SimpleInterest()));
			    break;
		    case 2:			
			    logger.info(String.valueOf(com.CompoundInterest()));
			    break;
            case 3:
       			logger.info(String.valueOf(com.SimpleInterest()));
                logger.info(String.valueOf(com.CompoundInterest()));
                break;
		}
		s.close();
        System.exit(0);
	}

	public static void main(String[] args) 
	{
	}
}

class ComputeInterest 
{
	double principle, rate_of_interest, time;
	
	ComputeInterest(double principle, double rate_of_interest, double time)
	{
		this.principle = principle;
		this.rate_of_interest = rate_of_interest;
		this.time = time;
	}
	
	
	double SimpleInterest() 
	{
		return (principle * rate_of_interest * time) / 100;
	}

	double CompoundInterest() 
	{
		return (principle * (Math.pow(1 + rate_of_interest / 100, time)));
	}

}