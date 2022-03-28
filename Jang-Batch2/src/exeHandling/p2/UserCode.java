package exeHandling.p2;

import java.util.Scanner;

public class UserCode {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		UserCode  webform = new UserCode();
		
		
		System.out.println("Enter Feedback ");
		String feedback = webform.sc.nextLine(); // becoz sc is static content
		
		try {
			
			boolean validationStatus = webform.processFeedbackValidation(feedback);
			if(validationStatus == true)
			{
				BusinessOperationCode server = new BusinessOperationCode();
				server.saveFeedbackInDB(feedback);
			}
	
		} 
		catch (OutofRangeException e) {
		
			System.out.println(e);
		}
		
		/*
		if(validationStatus)
		{
			System.out.println(" Thanks for Submitting feedback ");
		}
		else
		{
			System.out.println(" {color:red} Feedback should not contains more than 10 words");
		}*/
		
		//=================
		
		
	}
	
	public boolean processFeedbackValidation(String feedback)throws OutofRangeException
	{
		String words[] = feedback.split(" ");
		/*if(words.length>10) return false;
		else return true;
		*/
		
		//return (words.length<=10)?true:false;
		
		if(words.length<=10)
		{
			return true;
		}
		else
		{
			// throw an exception 
			
			OutofRangeException e = new OutofRangeException("Feedback should not contains more than 10 words , length is "+words.length);
			throw e;
		}
		
	}

}
