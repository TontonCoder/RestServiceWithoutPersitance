package fr.tonelv.rateandco.repositories;

import fr.tonelv.rateandco.dbconn.DbConn;
import fr.tonelv.rateandco.models.User;

import java.sql.*;
import java.util.ArrayList;

public class UsersRepository implements  IUsersRepository{
    private Connection conn;
    public UsersRepository()
    {
        conn = DbConn.getInstance().getConnection();
    }
    @Override
    public User Create(User user) {
        String sql = "INSERT INTO user(firstName,lastName,username, hash,isActive, role) VALUES(?,?,?,?,?,?)";
        try
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user.getFirstName());
            pstmt.setString(2,user.getLastName());
            pstmt.setString(3,user.getUsername());
            pstmt.setString(4,user.getHash());
            pstmt.setBoolean(5,user.isActive());
            pstmt.setString(6,user.getRole());
            pstmt.executeUpdate();

        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public User Get(Integer id) {
        return null;
    }

    @Override
    public User Update(User user) {
        return null;
    }

    @Override
    public boolean Delete(Integer id) {
        return false;
    }

    @Override
    public ArrayList<User> GetAll() {
        ArrayList<User> users = new ArrayList<User>();
        String sql = "SELECT * FROM user";
        try {
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next())
            {

                //User u = new User(rs.getInt("Id"),rs.getString("name"),rs.getString("description"), rs.getBoolean("isActive"));
                User u = new User();
                u.setId(rs.getInt("Id"));
                u.setFirstName(rs.getString("firstName"));
                u.setLastName(rs.getString("lastName"));
                u.setUsername(rs.getString("username"));
                u.setHash(rs.getString("hash"));
                u.setRole(rs.getString("role"));
                u.setActive(rs.getBoolean("isActive"));
                users.add(u);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }


        return users;
    }
}
