package com.telusk.graphqltut.service;


import com.telusk.graphqltut.entiry.User;
import org.springframework.boot.autoconfigure.graphql.data.GraphQlQueryByExampleAutoConfiguration;

import java.util.List;

public interface IUserReg  {

    List<User> getUser();



}
