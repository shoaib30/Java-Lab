
public class UnderFlowException extends Exception{
	String desc;
	UnderFlowException(String s){
		desc = s;
	}
	public String toString(){
		return desc;
	}
}
