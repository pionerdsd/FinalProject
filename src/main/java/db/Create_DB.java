package db;

import dao.DaoOrders;
import dao.DaoProducts;
import dao.DaoStatuses;
import dao.DaoUsers;
import entity.Orders;
import entity.Products;
import entity.Statuses;
import entity.Users;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

public class Create_DB {

    public static void main(String[] args) {
        DB_Builder.deleteDB("jdbc:mysql://127.0.0.1/", "Shop", "root", "root");
        DB_Builder.createDB("jdbc:mysql://127.0.0.1/", "Shop", "root", "root");


        DaoUsers du = new DaoUsers();
        Users user = new Users("User12345", "Password12345", "Uesr12345@mail.com", "123456789",
                "New York, Time Square - 1/2", 20, "21.01.1998", "TV");

        du.insert(user);


        DaoProducts dp = new DaoProducts();
        Products products = new Products("bread", 2);
        dp.insert(products);


        DaoOrders daoOrders = new DaoOrders();
      /*  daoOrders.insert(new Orders(new Users("User12345", "Password12345", "Uesr12345@mail.com", "123456789",
                "New York, Time Square - 1/2", 20, "21.01.1998", "TV"),new Products("bread", 2),1,2,"11:01:1987"));
                */
      //  daoOrders.insert(new Orders(user, products, 1, 2, "11:01:1987"));
        daoOrders.insert(new Orders(1, 1, 1, 2, "11:01:1987"));



        System.out.printf("ok!");
        System.exit(0);

    }

}
