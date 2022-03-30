package ic;

class SmartBlueToothDevice implements Bluetooth
{

	@Override
	public int shareFile(String fileName) {
		// code to share file
		return 60; // file share in 60 sec
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		MobileDevice smartphone = new MobileDevice();
		smartphone.shareFile("MySongs.MP3"); // do not need bluetooth object beoz its pre loaded during class loading 
		
		// ---- approach no 1 ------
		Laptop dell = new Laptop();
		Bluetooth btV4 = new SmartBlueToothDevice();
		dell.shareFileViaBlueTooth(btV4,"ggkg");
		
		
		// ----- approach no 2 ------
		
		
		Laptop dellNew = new Laptop();
		dellNew.shareFileViaBlueTooth(
				new Bluetooth() {
			
									@Override
									public int shareFile(String fileName) {
										
										return 15; // file shared in 15sec
									}
		                        }     , "svdvds.txt");
		
		// --------- approach no 3.1 java 8 onwards -------
		
		Laptop hp = new Laptop();
		
		Bluetooth lamdbaBt1 = (String abc)->{
			 			return 10;
							};
					
		int time = lamdbaBt1.shareFile("dgdrg");
		
		// --------- approach no 3.2 java 8 onwards -------
		Bluetooth lamdbaBt2 = (abc)->{
 			return 10;
		};
		 time = lamdbaBt1.shareFile("dgdrg");

		// --------- approach no 3.3 java 8 onwards -------
			
		 Bluetooth lamdbaBt3 = (x)-> 10;
			 time = lamdbaBt1.shareFile("dgdrg");

		
		
		
		
		
							
		//hp.shareFileViaBlueTooth( lamdbaBt1.shareFile("MyNewFile"), "dvdfbrg");
		
		
	}//end main
	
	
	
}//end class











