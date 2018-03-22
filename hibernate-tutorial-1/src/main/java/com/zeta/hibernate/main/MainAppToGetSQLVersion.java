package com.zeta.hibernate.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zeta.hibernate.util.HibernateUtil;

public class MainAppToGetSQLVersion {
	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();

			// Check database version
			String sql = "select version()";

			String result = (String) session.createNativeQuery(sql).getSingleResult();
			System.out.println(result);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		HibernateUtil.shutdown();
	}
}