package MyProject.service;

import MyProject.domain.User;
/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 8, 2012
 * Time: 4:59:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SignUpService
{
    public void setUser(User user);
    public User getUserByUserEmail(String email);
}
