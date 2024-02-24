package OOps;
class User
{
	private  String username;
    
    
    public void setUsername(String username)
    {
    	this.username=username;
    }
    public String getUsername()
    {
    	return username;
    }
}
public class Exp2Encapsulation
{

	public static void main(String[] args)
	{
		User u=new User();
		u.setUsername("scott");
		System.out.println(u.getUsername());
		
	}

}
