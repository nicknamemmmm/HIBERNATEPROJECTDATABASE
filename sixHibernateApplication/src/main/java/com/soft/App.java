package com.soft;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.soft.entity.CreateAndUpdate;

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
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Id");
        int id = sc.nextInt();
        System.out.println("Enter The Name");
        String Name = sc.next();
        System.out.println("Enter The Surname");
        String Surname = sc.next();
        System.out.println("Enter The Nickname");
        String Nickname = sc.next();
        System.out.println("Enter The Email");
        String Email = sc.next();
        System.out.println("Enter The Password");
        String Password = sc.next();
        
        CreateAndUpdate std = new CreateAndUpdate(id, Name, Surname, Nickname, Email, Password);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(std);
        tx.commit();
    }
}
