package by.home.controllers;

import by.home.supportclass.Validator;
import dao.DaoUsers;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RegistraionController {


    @RequestMapping(value = "/registration")
    public String registrationPage() {
        return "registration";
    }

    @RequestMapping(value = "/register")
    public String registerMe(@RequestParam String newLogin, @RequestParam String newPassword, @RequestParam String ConfirmPassword, @RequestParam String email, @RequestParam String birthdate, @RequestParam String telephone, @RequestParam String address, Model model, HttpSession session) {
       /* System.out.println(newLogin );
        System.out.println(newPassword);
        System.out.println(ConfirmPassword);
        System.out.println(email);
        System.out.println(birthday);
        //System.out.println(String.valueOf(check));*/

        if(new Validator().Registration(newLogin, newPassword, ConfirmPassword, email, birthdate, 5, address, telephone)){
            System.out.println("Validation ok");
            DaoUsers du = new DaoUsers();
            List<Users> list = du.getAll("FROM Users where login = '" + newLogin + "' AND email = '" + email + "' AND telephone = '" + telephone + "'" );
            System.out.println(list);
            if(list.isEmpty()) {
                du.insert(new Users(newLogin, newPassword, email, telephone, address, 20, birthdate, "TV"));
                model.addAttribute("RegOk","Регистрация прошла успешно!");
            }
            return "index";
        }

        model.addAttribute("RegOk","Регистрация не прошла успешно!");
        return "index";
    }
}
