package MyProject.dao;

import MyProject.domain.User;
/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 8, 2012
 * Time: 5:18:26 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao
{
    public void setUser(User user);
	public User getUserByEmail(String email);
}
