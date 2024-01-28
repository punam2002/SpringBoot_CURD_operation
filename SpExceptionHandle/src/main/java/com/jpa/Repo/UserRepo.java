package com.jpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.Model.UserNew;

public interface UserRepo extends JpaRepository<UserNew,Long> {

}
