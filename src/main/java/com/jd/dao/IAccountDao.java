package com.jd.dao;

import com.jd.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DJ
 * @Date 2020/7/29 0029
 * @Time 19:15
 * @Description: com.jd.dao
 */
@Repository("accountDao")
public interface IAccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account (name, age) values (#{name}, #{age})")
    void save(Account account);
}
