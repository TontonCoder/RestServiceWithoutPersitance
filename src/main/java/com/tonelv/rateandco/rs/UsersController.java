package com.tonelv.rateandco.rs;

import fr.tonelv.rateandco.models.User;
import fr.tonelv.rateandco.repositories.UsersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class UsersController {
    private UsersRepository usersRepository;

    //Create
    @PostMapping("/users")
    public ResponseEntity<User> PostUser(@RequestBody User user)
    {
        if(user != null)
        {
            System.out.println("Users value entered:"+user.toString());
            usersRepository.Create(user);
            return ResponseEntity.ok(user);
        }
        return null;
    }
    //Get All
    @GetMapping("/users")
    public ArrayList<User> GetAll()
    {
        usersRepository = new UsersRepository();
        //Not safe to send all!!
        return usersRepository.GetAll();
    }

    //Get By Id

    //Update

    //Delete
}
