package com.jd.service.imp;

import com.jd.dao.IAccountDao;
import com.jd.domain.Account;
import com.jd.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author DJ
 * @Date 2020/7/29 0029
 * @Time 19:18
 * @Description: com.jd.service.imp
 */
@Service
@Transactional
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
