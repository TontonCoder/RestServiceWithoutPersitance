package fr.tonelv.rateandco.repositories;

import fr.tonelv.rateandco.models.User;

import java.util.ArrayList;

public interface IUsersRepository {
    User Create(User user);
    User Get(Integer id);
    User Update(User user);
    boolean Delete(Integer id);
    ArrayList<User> GetAll();
}
