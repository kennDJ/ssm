package com.jd.controller;

import com.jd.domain.Account;
import com.jd.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author DJ
 * @Date 2020/7/29 0029
 * @Time 19:51
 * @Description: com.jd.controller
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model, HttpServletRequest request){
        List<Account> all = accountService.findAll();
        model.addAttribute("list", all);
        System.out.println(request.getScheme());
        System.out.println(request.getServerName());
        System.out.println(request.getServerPort());
        System.out.println(request.getContextPath());
        System.out.println(all);

        return "list";
    }
}
