package OOps;

public class Exp1Encapsulation
{
	private String username;
    private String password;
	// setter method
	public void setusername(String username)
	{
		this.username = username;
	}
	// getter method
	public String getusername() 
	{
		return username;
	}
	public void setpassword(String password)
	{
		this.password = password;
	}
	public String getpassword() 
	{
		return password;
	}
    public static void main(String[] args)
	{
		Exp1Encapsulation e1 = new Exp1Encapsulation();
		e1.setusername("Lokesh");
		System.out.println(e1.getusername());
		e1.password = "lokesh@123";
		System.out.println(e1.getpassword());
	}
}


