package MyProject.service;

import MyProject.dao.UserDaoImpl;
import MyProject.dao.UserDao;
import MyProject.domain.User;
/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 8, 2012
 * Time: 4:59:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignUpServiceImpl implements SignUpService
{
    private UserDaoImpl userDaoImpl;
    private UserDao userDao;

    public void serUserDao(UserDaoImpl userDao)
    {
        this.userDao=userDao;
    }
    public UserDaoImpl getUserDao()
    {
        return userDaoImpl;
    }
//    @Override
    public void setUser(User user)
    {
        userDao.setUser(user);
    }
//    @Override
    public User getUserByUserEmail(String email)
    {
        User user=userDao.getUserByEmail("sudeepta.sust@gmail.com");
        return (user != null)
                ? user
                : null;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


}
