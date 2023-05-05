package com.soft;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.soft.entity.Bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cnfg = new Configuration();
        cnfg.configure("/com/soft/cnfg/hibernate.cfg.xml");
        SessionFactory factory = cnfg.buildSessionFactory();
        
Bank bk=new Bank();
        
        bk.setId(101);
        bk.setName("yogesh");
        bk.setSurname("chavhan");
        bk.setEmail("Chavhanyogesh@gmailcom");
        bk.setPassword("Yogesh@1999");
        bk.setAccoNo(1457951458);
        
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(bk);
        tx.commit();
    }
}
