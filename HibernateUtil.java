package com.joshua.Util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.joshua.Entity.Book;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			Configuration con=new Configuration();
			Properties p=new Properties();
			p.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			p.put(Environment.URL,"jdbc:mysql://localhost:3306/joshuadb");
			p.put(Environment.USER,"root");
			p.put(Environment.PASS,"joshua@0107");
			p.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			p.put(Environment.SHOW_SQL,"true");
			p.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
			p.put(Environment.HBM2DDL_AUTO,"create-drop");
			con.setProperties(p);
			con.addAnnotatedClass(Book.class);
			ServiceRegistry sR=new StandardServiceRegistryBuilder()
			.applySettings(con.getProperties()).build();
			sessionFactory =con.buildSessionFactory(sR);
			}//end if
		
		return sessionFactory;
		
	}//end method
	
	
}//end class
