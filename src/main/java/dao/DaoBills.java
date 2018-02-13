package dao;

import db.HibernateUtil;
import entity.Bill;
import org.hibernate.Session;

import java.util.List;

public class DaoBills implements DaoInterface<Bill> {
    @Override
    public void insert(Bill ob) {
        Session session = HibernateUtil.getSession();
        session.save(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void update(Bill ob) {
        Session session = HibernateUtil.getSession();
        session.update(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void delete(Bill ob) {
        Session session = HibernateUtil.getSession();
        session.delete(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public Bill get(int id) {
        Session session = HibernateUtil.getSession();
        Bill user = session.get(Bill.class, id);
        HibernateUtil.closeSession(session);
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bill> getAll(String sql) {
        Session session = HibernateUtil.getSession();
        List<Bill> list = session.createQuery(sql).list();
        HibernateUtil.closeSession(session);
        return list;
    }


}
