package a1;

/*
  complete the code so that class can compile and generate output 
   NOTE : You cannot change the code structure
   
 */
public class Assignment1 {

	int arr[] = {45,78,95,43,15,37,150,20};
	
	public static void main(String[] args) {
	
		Assignment1 obj = new Assignment1();
		int searchNumber = 105; // scanner , through user input 
		int position = obj.getElementPosition(searchNumber);
		obj.displayInfomation(searchNumber, position);
	}
	
	
	public int getElementPosition(int searchNumber)
	{
		
		for (int i =0;i<arr.length;i++) 
		{
			if(arr[i] == searchNumber)
			{
				return i;
			}//end of if
		}//end of for 
		
		return -1;
	}//end of get Element by position 
	
	public void displayInfomation(int searchNumber,int position)
	{
		if(position == -1)
		{
			System.out.println(searchNumber+" not in the list");
		}
		else 
		{
			System.out.println(searchNumber+" is available at position "+position);
		}
	}
}//end class
