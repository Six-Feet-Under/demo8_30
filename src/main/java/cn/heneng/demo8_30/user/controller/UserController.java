package cn.heneng.demo8_30.user.controller;

import cn.heneng.demo8_30.user.entity.UserEntity;
import cn.heneng.demo8_30.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {
        userService.save(userEntity);
        return "success";
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "success";
    }
}
