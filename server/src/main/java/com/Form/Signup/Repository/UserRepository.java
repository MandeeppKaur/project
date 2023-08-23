package com.Form.Signup.Repository;

import com.Form.Signup.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
