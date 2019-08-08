package fr.tonelv.rateandco.repositories;

import fr.tonelv.rateandco.dbconn.DbConn;
import fr.tonelv.rateandco.models.User;

import java.sql.Connection;
import java.util.ArrayList;

public class UsersRepository implements  IUsersRepository{
    private Connection conn;
    public UsersRepository()
    {
        conn = DbConn.getInstance().getConnection();
    }
    @Override
    public User Create(User user) {
        return null;
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
        return null;
    }
}
