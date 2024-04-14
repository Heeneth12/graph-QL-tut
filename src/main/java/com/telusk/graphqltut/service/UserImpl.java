package com.telusk.graphqltut.service;

import com.telusk.graphqltut.entiry.User;
import com.telusk.graphqltut.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class UserImpl implements IUserReg {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getUser() {
        return userRepo.findAll();
    }

}
