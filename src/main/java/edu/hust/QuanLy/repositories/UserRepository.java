package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findUserByuserNameAndPassword(String username, String password);
}
