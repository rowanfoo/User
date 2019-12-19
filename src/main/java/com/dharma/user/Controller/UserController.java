package com.dharma.user.Controller;

import com.dhamma.pesistence.entity.data.QUser;
import com.dhamma.pesistence.entity.data.User;
import com.dhamma.pesistence.entity.repo.UserRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserRepo userRepo;
    private static ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping(value = "/user/algo/{userid}")
    public JsonNode useralgo(@PathVariable String userid) {
        System.out.println("----------------getbydate-------" + userid);

        String json = userRepo.findOne(QUser.user.userid.eq(userid)).get().getAlgo();
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper.readTree(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonNode;
    }

    @GetMapping(value = "/user/user/{userid}")
    public User user(@PathVariable String userid) {
        System.out.println("----------------USER-------" + userid);
        return userRepo.findOne(QUser.user.userid.eq(userid)).get()
    }

    @PutMapping("/user")
    public void insert(@RequestBody User user) {
        System.out.println("----insert-------------" + user);
        userRepo.save(user);
    }

}
