package com.jd.service;

import com.jd.domain.Account;

import java.util.List;

/**
 * @author DJ
 * @Date 2020/7/29 0029
 * @Time 19:17
 * @Description: com.jd.service
 */
public interface IAccountService {

    List<Account> findAll();

    void save(Account account);
}
