package by.home.controllers;

import dao.DaoUsers;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AuthorizathionController {
    @RequestMapping(value = "/authorization")
    public String authorization(@RequestParam String newLogin, @RequestParam String newPassword, Model model, HttpSession session) {
        DaoUsers du = new DaoUsers();
        List<Users> list = du.getAll("FROM Users WHERE Login = '" + newLogin + "' AND Password = '" + newPassword + "'");
        if(!list.isEmpty()){
            model.addAttribute("loggedIn",newLogin);
            model.addAttribute("RegOk","Авторизация прошла успешно!");
            return "index3";
        }

        System.out.println(list);
        System.out.println(newLogin + " " + newPassword);
        System.out.println("Регистрация не прошла");
        model.addAttribute("BadReg","Авторизация не прошла!");
        return "index";

    }
}