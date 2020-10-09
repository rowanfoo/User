package com.dharma.user.Controller;

import com.dhamma.pesistence.entity.data.QUser;
import com.dhamma.pesistence.entity.data.User;
import com.dhamma.pesistence.entity.repo.UserRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserRepo userRepo;
    private static ObjectMapper objectMapper = new ObjectMapper();

//    @GetMapping(value = "/user/algo/{userid}")
//    public JsonNode useralgo(@PathVariable String userid) {
//        System.out.println("----------------getbydate-------" + userid);
//
//        String json = userRepo.findOne(QUser.user.userid.eq(userid)).get().getAlgo();
//        JsonNode jsonNode = null;
//        try {
//            jsonNode = objectMapper.readTree(json);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//        return jsonNode;
//    }

    @GetMapping("/hello")
    public String root() {
        return "hello world";
    }


    @GetMapping(value = "/user/algo/{userid}")
    public ResponseEntity<JsonNode> useralgo(@PathVariable String userid) {
        System.out.println("----------------getbydate-------" + userid);

        String json = userRepo.findOne(QUser.user.username.eq(userid)).get().getAlgo();
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper.readTree(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        //return new  ResponseEntity<>(jsonNode, HttpStatus.FOUND) ;
        return new ResponseEntity<>(jsonNode, HttpStatus.OK);


    }


    @GetMapping(value = "/user/user/{userid}")
    public User user(@PathVariable String userid) {
        System.out.println("----------------USER-------" + userid);
        return userRepo.findOne(QUser.user.username.eq(userid)).get();
    }

//    @PutMapping("/user")
//    public void insert(@RequestBody User user) {
//        System.out.println("----insert-------------" + user);
//        userRepo.save(user);
//    }


    @PutMapping("/user/algo/{userid}")
    public void insert(@PathVariable String userid, @RequestBody JsonNode node) {

        System.out.println("----insert-------------" + node);
        System.out.println("----insert---------userid----" + userid);
        User usr = userRepo.findOne(QUser.user.username.eq(userid)).get();
        //System.out.println("----insert---------user----" + usr);

        if (usr != null) {
            usr.setAlgo(node.toPrettyString());
            userRepo.save(usr);
        }

//        System.out.println("----insert-------------" + node);
        //userRepo.save(user);
    }

}
