package com.soft;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.soft.entity.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cnfg = new Configuration();
        cnfg.configure("com/soft/cnfg/hibernate.cfg.xml");
        
        SessionFactory factory = cnfg.buildSessionFactory();
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Aarti");
        emp.setEmpDep("developer");
        emp.setEmpSal(1000);
        
        Session session = factory.openSession(); 
       
        Transaction tx = session.beginTransaction();
        session.save(emp);  
        tx.commit();
    }
}
