package helper;
import java.util.HashMap;

public class Authenticator {
	String user;
	String pass;
	HashMap<String,String> users;
	boolean isAuth;
	public Authenticator()	{
		users = new HashMap<>();
		users.put("qwerty","123");
		users.put("asd", "345");
		isAuth = false;
	}
	public void setUser(String user){
		this.user = user;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public boolean getAuth()	{
		if(users.containsKey(user))	{
			if(users.get(user).equals(pass))	{
				isAuth = true;
			}
		}
		System.out.println("user: "+user+"  pass: "+pass);
		System.out.println("UserAuth: "+isAuth);
		return isAuth;
	}
	
}
