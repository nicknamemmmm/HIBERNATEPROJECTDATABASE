package com.soft;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.soft.entity.Address;
import com.soft.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Address address= new Address();
        address.setPincode(9038);
        address.setCity("nagpur");
        address.setState("maharastra");
        
        Student std=new Student();
        std.setId(101);
        std.setName("Aarti");
        std.setScname("dontknown");
        Configuration conf = new Configuration();
        conf.configure("com/soft/cnfg/hibernate.cfg.xml");
        SessionFactory factory = conf.buildSessionFactory();
        
        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(std);
        tx.commit();
    }
}
