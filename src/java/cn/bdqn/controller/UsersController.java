package cn.bdqn.controller;

import cn.bdqn.pojo.Users;

import javax.annotation.Resource;
import cn.bdqn.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;

public class UsersController {

    @Resource
    private UsersService usersService;

    //跳转到主页的方法
    @RequestMapping("/shouye.html")
    public String shouye() {
        return "shouye";
    }

    //跳转到登入页面的方法
    @RequestMapping("/index.html")
    public String index() {
        return "index";
    }


    //登入主页的方法
    @RequestMapping("/login.html")
    public String login(String name, String pwd, Model model) {
        Users users = usersService.findUser(name, pwd);
        if (users != null) {
            return "redirect:/shouye.html";
        } else {
            model.addAttribute("info", "用户名或密码错误!");
            return "index";
        }
    }
}