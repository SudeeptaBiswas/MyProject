package MyProject.dao;

import MyProject.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: sudeepta
 * Date: Jan 8, 2012
 * Time: 5:23:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoImpl implements UserDao
{
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
    @Override
    public void setUser(User user)
    {
        String userName=user.getName();
        String password=user.getPassword();
        String email=user.getEmail();
        String query = "INSERT INTO users ( userName, password, email) VALUES (?,?,?)";
		jdbcTemplate.update(query, new Object[] { userName, password, email });
    }
    @Override
	public User getUserByEmail(String email)
    {
        try
        {
            String query = "SELECT * FROM users WHERE email=?";
            User users =  (User) jdbcTemplate.queryForObject(query, new Object[] { email },
            new RowMapper()
            {
                public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException
                {
                    return new User(resultSet.getString("userName"), resultSet.getString("password"), resultSet.getString("email"));
                }
            });
            return users==null
                ? null
                : users;

        }
        catch(Exception e)
            {return null;}
    }

}
