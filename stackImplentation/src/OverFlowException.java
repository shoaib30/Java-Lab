
public class OverFlowException extends Exception{
	String desc;
	OverFlowException(String s){
		desc = s;
	}
	public String toString(){
		return desc;
	}
}
