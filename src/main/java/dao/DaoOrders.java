package dao;

import db.HibernateUtil;
import entity.Orders;
import org.hibernate.Session;

import java.util.List;

public class DaoOrders implements DaoInterface <Orders> {
    @Override
    public void insert(Orders ob) {
        Session session = HibernateUtil.getSession();
        session.save(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void update(Orders ob) {
        Session session = HibernateUtil.getSession();
        session.update(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void delete(Orders ob) {
        Session session = HibernateUtil.getSession();
        session.delete(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public Orders get(int id) {
        Session session = HibernateUtil.getSession();
        Orders user = session.get(Orders.class, id);
        HibernateUtil.closeSession(session);
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Orders> getAll(String sql) {
        Session session = HibernateUtil.getSession();
        List<Orders> list = session.createQuery(sql).list();
        HibernateUtil.closeSession(session);
        return list;
    }

}
