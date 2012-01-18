package MyProject.domain;

/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 8, 2012
 * Time: 5:02:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class User
{
    private String name;
    private String password;
    private String email;

    public User(){}

    public User(String userName, String password, String email) {
		this.name = userName;
		this.password = password;
        this.email=email;
	}
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
}
