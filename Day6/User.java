package travel.user;

public class User 
{
    private String userId;
    private String name;

    public User(String userId, String name) 
	{
        this.userId = userId;
        this.name = name;
    }

    public void bookTicket() 
	{
        System.out.println("User ID       : " + userId);
        System.out.println("User Name     : " + name);
    }
}