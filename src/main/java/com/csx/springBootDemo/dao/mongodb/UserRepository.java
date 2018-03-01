package com.csx.springBootDemo.dao.mongodb;

import com.csx.springBootDemo.domain.mongodb.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/01
 */
public interface UserRepository extends MongoRepository<User,Long> {
    User findByUsername(String username);
}
