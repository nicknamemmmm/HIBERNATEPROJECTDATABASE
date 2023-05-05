package com.soft;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.soft.entity.FamilyDetails;

public class App 
{
    public static void main( String[] args )
    {
       Configuration conf = new Configuration();
       conf.configure("com/soft/cnfg/hibernate.cfg.xml");
       SessionFactory factory = conf.buildSessionFactory();
       
       FamilyDetails emp = new FamilyDetails();
       emp.setName("Aarti");
       emp.setSurname("Chavhan");
       emp.setWork("farmerworker");
       emp.setNickname("vendi");
       emp.setSalary(200);
       
       Session session = factory.openSession();
       
       Transaction tr = session.beginTransaction();
       session.save(emp);
       tr.commit();
    }
}
