package by.home.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.DaoUsers;
import entity.Users;

@Controller
/*@RequestMapping(value="/test")*/
public class IndexController {

    @RequestMapping(value="/")
    public String indexPage() {
        return "index";
    }


    /*@RequestMapping(value="/registration")
    public String registration( @RequestParam String email, @RequestParam String password, @RequestParam String telephone, Model model, HttpSession session) {
        DaoUsers du = new DaoUsers();
        List<Users> list = du.getAll("FROM Users WHERE email ='" + email + "'");
        if(list.isEmpty()) {
            du.insert(new Users(email, telephone, password));
            List<Users> listUsers = du.getAll("FROM Users");
            model.addAttribute("listUsers", listUsers);
            model.addAttribute("text", "Регистрация прошла успешно");
        }else {
            model.addAttribute("text", "Всё отстой =(");
        }
        return "registration";
    }

    @RequestMapping(value="/test")
    public String test( @RequestParam String login, @RequestParam String password) {

        return "test";
    }



	/*@RequestMapping(value="/registration")
	public ModelAndView registration(WebRequest request @RequestParam String email, @RequestParam String password, @RequestParam String telephone) {
		ModelAndView mav = new ModelAndView("registration");
		mav.setViewName("registration");
		DaoUsers du = new DaoUsers();
		List<Users> list = du.getAll("FROM Users WHERE email ='" + email + "'");
		if(list.isEmpty()) {
			du.insert(new Users(email, telephone, password));
			List<Users> listUsers = du.getAll("FROM Users");
			mav.addObject("listUsers", listUsers);
			mav.addObject("text", "Регистрация прошла успешно");
		}else {
			mav.addObject("text", "Всё отстой =(");
		}
		return mav;
	}*/

}
