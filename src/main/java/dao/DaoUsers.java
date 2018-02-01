package dao;

import java.util.List;

import db.HibernateUtil;
import org.hibernate.Session;


import entity.Users;

public class DaoUsers implements DaoInterface<Users>{

	@Override
	public void insert(Users ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void update(Users ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void delete(Users ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public Users get(int id) {
		Session session = HibernateUtil.getSession();
		Users user = session.get(Users.class, id);
		HibernateUtil.closeSession(session);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAll(String sql) {
		Session session = HibernateUtil.getSession();
		List<Users> list = session.createQuery(sql).list();
		HibernateUtil.closeSession(session);
		return list;
	}

}
