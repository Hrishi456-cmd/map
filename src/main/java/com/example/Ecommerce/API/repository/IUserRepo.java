package com.example.Ecommerce.API.repository;

import com.example.Ecommerce.API.models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Long> {
}
