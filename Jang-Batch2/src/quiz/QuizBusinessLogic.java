package quiz;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class QuizBusinessLogic {

	String questions[]; // 3-4
	String options[][] ; // every question has 4 options
	int answers[]; // correct answers
	float point = 0;
	Scanner sc = new Scanner(System.in);
	
	public QuizBusinessLogic() {
		 // act like as our database 
		questions = new String[3];
		options = new String[3][4];
		answers = new int[3];
		
		questions[0] = "1) 4+ 8";
		questions[1] = "2) 14+14";
		questions[2] = "3) 0+8";
		
		options[0][0] = "1]  1";
		options[0][1] = "2]  0";
		options[0][2] = "3]  12";
		options[0][3] = "4]  10";
		
		options[1][0] = "1]  28";
		options[1][1] = "2]  10";
		options[1][2] = "3]  45";
		options[1][3] = "4]  78";
		
		options[2][0] = "1]  0";
		options[2][1] = "2]  -1";
		options[2][2] = "3]  8";
		options[2][3] = "4]  88";
		
		answers[0] = 3;
		answers[1] = 1;
		answers[2] = 3;
	}//end of constructor
	
	
	public void playQuiz()
	{
		
		for(int q = 0;q<questions.length;q++)
		{
			System.out.println(questions[q]+" ");
			for(int op = 0;op<4;op++)
			{
				if(op == 2) System.out.print("\n");
				System.out.print(" "+options[q][op]+"\t");
			}
			
			System.out.println("\n Enter Answer :- ");
			int userAnswer = sc.nextInt();
			
			if(userAnswer == answers[q])
			{
				point++;
			}
			else
			{
				if(point == 0) break;
				else point-= 0.5;
				
			}
			
			System.out.println("--------------------------------------------------");
			
		}//end of for 
		
		if(point == 0) System.out.println("Try next time ");
		else System.out.println(" Points "+point);
	}
	
	
	
}//end class
