package br.com.nathanroberto.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepsitory extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username);
}
