package dao;

import db.HibernateUtil;
import entity.Products;
import org.hibernate.Session;

import java.util.List;

public class DaoProducts implements DaoInterface<Products>
{
    @Override
    public void insert(Products ob) {
        Session session = HibernateUtil.getSession();
        session.save(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void update(Products ob) {
        Session session = HibernateUtil.getSession();
        session.update(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void delete(Products ob) {
        Session session = HibernateUtil.getSession();
        session.delete(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public Products get(int id) {
        Session session = HibernateUtil.getSession();
        Products user = session.get(Products.class, id);
        HibernateUtil.closeSession(session);
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Products> getAll(String sql) {
        Session session = HibernateUtil.getSession();
        List<Products> list = session.createQuery(sql).list();
        HibernateUtil.closeSession(session);
        return list;
    }

}
