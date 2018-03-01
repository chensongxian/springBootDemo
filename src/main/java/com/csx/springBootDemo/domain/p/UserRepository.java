package com.csx.springBootDemo.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/02/28
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
