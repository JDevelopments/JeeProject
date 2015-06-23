package ua.ziper.timex.test;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ua.ziper.timex.model.Department;
import ua.ziper.timex.persistent.*;

public class HibernateTest {
	public static void main(String[] args) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Department department = new Department();
	
		List list = session.createQuery("from Department").list();
		for (int i = 0; i < list.size(); i++) {
			department = (Department) list.get(i);
			System.out.println(i+") " + department.getName()+" "+department.getDepartmentId());
		}
	}
}
