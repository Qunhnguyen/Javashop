package shop.javashop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop.javashop.Service.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/")
    public String getHomepage(){
        String test  = this.userService.handelHello();
        return "eric";
    }
    @RequestMapping("/admin/user")
    public String getUserPage(){
        return "admin/user/create";
    }
    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUserPage(){
        System.out.println("run here");
        return "eric";
    }
}
