package com.csx.springBootDemo.domain.s;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/02/28
 */
public interface MessageRepository extends JpaRepository<Message,Long>{
}
