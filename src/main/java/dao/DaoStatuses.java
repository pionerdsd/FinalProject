package dao;

import db.HibernateUtil;
import entity.Statuses;
import org.hibernate.Session;

import java.util.List;

public class DaoStatuses implements DaoInterface <Statuses> {
    @Override
    public void insert(Statuses ob) {
        Session session = HibernateUtil.getSession();
        session.save(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void update(Statuses ob) {
        Session session = HibernateUtil.getSession();
        session.update(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public void delete(Statuses ob) {
        Session session = HibernateUtil.getSession();
        session.delete(ob);
        HibernateUtil.closeSession(session);
    }

    @Override
    public Statuses get(int id) {
        Session session = HibernateUtil.getSession();
        Statuses user = session.get(Statuses.class, id);
        HibernateUtil.closeSession(session);
        return user;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Statuses> getAll(String sql) {
        Session session = HibernateUtil.getSession();
        List<Statuses> list = session.createQuery(sql).list();
        HibernateUtil.closeSession(session);
        return list;
    }

}
