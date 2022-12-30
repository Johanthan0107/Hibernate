package com.supriya;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.supriya.entity.Student;
import com.supriya.util.HibernateUtil;
public class App{
 public static void main( String[] args ) {
 Session session=HibernateUtil.getSessionFactory().openSession();

 Student s=new Student();
 s.setSno(1);
 s.setSname("Supriya");
 s.setCourse("Java");

 Student s2=new Student();
 s2.setSno(2);
 s2.setSname("Supriya");
 s2.setCourse("HIBERNATE");

 Transaction tr=session.beginTransaction();
 //save the object
 session.save(s);
 session.save(s2);
 tr.commit();
 // close the session
 }
}
