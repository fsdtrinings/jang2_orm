package ic;

public class Laptop {
	
	public void doProgramming()
	{
		
	}
	
	public void watchMovie()
	{
		
	}
	
	public void shareFileViaBlueTooth
	          (Bluetooth bluetooth,String fileName)
	{
		int time = bluetooth.shareFile(fileName);
		System.out.println(fileName+" shared within "+time+" sec. ");
	}

}
