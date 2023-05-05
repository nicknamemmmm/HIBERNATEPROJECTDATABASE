package com.soft;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.soft.entity.ByUsingScanner;

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
        
        SessionFactory factory=cnfg.buildSessionFactory();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enater the ID");
        int id=sc.nextInt();
        System.out.println("Enter the Name");
        String Name=sc.next();
        System.out.println("Enter the Email");
        String Email=sc.next();
        System.out.println("Enter the Password");
        String Password=sc.next();
        
        ByUsingScanner bys=new ByUsingScanner(id, Name, Email, Password);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(bys);
        tx.commit();
        
    }
}
