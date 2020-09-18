import java.util.Scanner;
public class WiFiDiagnosis
{

	public static void main(String[] args) 
	{
		
		  
		String choice = "no" ;
		String choice5 = "yes" ;  
		
		
		String question1, question2 = null;  
		 
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer\r\n" + 
				"Are you able to connect with the internet? (yes or no)\r\n" + 
				" ");
		
		Scanner answer1  = new Scanner(System.in);
		question1 = answer1.nextLine();
		if( question1.equals(choice))	
		{
			
			System.out.println("Second step: reboot your router\r\n" + 
					"Now are you able to connect with the internet? (yes or no)\r\n" + 
					" ");
			question1 = answer1.nextLine();
			
			
			if(question1.equals(choice))	
			{	
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\r\n" + 
						"Now are you able to connect with the internet? (yes or no)   " );
				question1 = answer1.nextLine();
				if( question1.equals(choice))
				{
					System.out.println("Fourth step: move your computer closer to your router\r\n" + 
							"Now are you able to connect with the internet? (yes or no)  " );
					question1 = answer1.nextLine();
					if( question1.equals(choice))	
					{
						{System.out.println( "Fifth step: contact your ISP\r\n" + 
								"Make sure your ISP is hooked up to your router.\r\n" + 
								" " );}	
						question1 = answer1.nextLine();
						 if( question2.equals(choice5))
						{
							System.exit(0);
						}
						
					}
				}
				
				
			}	
				
				
		}
		
	 
			
			
			
		 
		
	
	}
	
}	