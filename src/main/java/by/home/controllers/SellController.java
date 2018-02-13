package by.home.controllers;

import dao.DaoBills;
import dao.DaoOrders;
import dao.DaoProducts;
import entity.Bill;
import entity.Orders;
import entity.Products;
import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SellController {
    @RequestMapping(value = "gta")
    public String Sell(Model model, HttpSession session) {
       Users user = (Users)session.getAttribute("user");
        System.out.println(user);
        DaoProducts DP = new DaoProducts();
        List<Products> DPlist = DP.getAll("FROM Products WHERE Type = 'gta'");
        System.out.println(DPlist);
        for (Products p: DPlist ){
            if ((Integer)p.getQuantity()> (Integer)p.getOrdered()){
                p.setQuantity(p.getQuantity()-1);
                p.setOrdered(p.getOrdered()+1);
                DP.update(p);
                DaoOrders DO = new DaoOrders();

                DO.insert(new Orders(user.getId(),p.getId(),1,p.getPrice()));
            }else {
                model.addAttribute("State","Нет на складе!");
                return "index3";
            }
        }
        System.out.println(DPlist);

        model.addAttribute("State","Добавлен в корзину!");
        return "index3";
    }
@RequestMapping (value = "buy")
    public String Buy(Model model, HttpSession session){
    DaoOrders DO = new DaoOrders();
    DaoProducts DP = new DaoProducts();
    Users user = (Users)session.getAttribute("user");


    List<Orders> OList = DO.getAll("FROM Orders where user_id = '" + user.getId() + "'");
    for(Orders o: OList){
   /*
    select u.login, p.type, o.quantity, o.price from orders o
join users u on u.id=o.user_id
join products p on p.id=o.product_id
where u.id=1
     */

        DaoBills DB = new DaoBills();
        List<Bill> DBList = DB.getAll("select u.login, p.type, o.quantity, o.price from orders o join users u on u.id=o.user_id join products p on p.id=o.product_id where u.id=1");


        /*Products p = DP.get(o.getProduct_id());
        p.setQuantity(p.getQuantity()-1);
        DP.update(p);*/


        System.out.println(DBList);
    }



        return "index3";
}

}
