package com.telusk.graphqltut.repository;

import com.telusk.graphqltut.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User , Long> {
}
