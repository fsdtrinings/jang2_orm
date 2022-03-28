package exeHandling.p2;

public class OutofRangeException extends Exception{

	String execeptionMsg;

	public OutofRangeException(String execeptionMsg) {
		super();
		this.execeptionMsg = execeptionMsg;
	}

	@Override
	public String toString() {
		return "{color : red} "+execeptionMsg;
	}
	
	
	
}
