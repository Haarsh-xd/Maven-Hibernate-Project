package com.hibernateproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started :) " );
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
/** ****************************************OR*******************************************
Configuration cfg =new  Configuration();
cfg.configure("hibernate.cfg.xml");---->Provide the file name or path of the file in case of other than default name or location
SessionFactory sf = cfg.buildSessionFactory();
*/     
//creating student object
        
        Student st = new Student();
        st.setId(108);
        st.setName("gajanan");
        st.setMobileNo(987456321);
        st.setEmail("@gmail.com");
        st.setCity("Pune");
        
        System.out.println(st);

//Creating Address class object
        
        Address ad= new Address();
        
        ad.setStreet("Vaijapur");
        ad.setCity("Aurangabad"); 
        ad.setAddedDate(new Date());
        ad.setX("123");
        
//Reading image and saving it in Database
        
//        FileInputStream fis =new FileInputStream("src/main/java/IMG-20240210-WA9.jpg");
//        byte [] imageData = new byte[fis.available()];
//        ad.setImage(imageData);
        
        
        Session session = sf.openSession();
        Transaction tx= session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out .println("Done");
        System.out.println(sf);
        System.out.println(sf.isClosed());
    }
}
