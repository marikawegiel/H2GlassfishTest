package com.marika.H2GlassfishTest;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) throws Exception {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.setDataSource((DataSource) context.getBean("dataSource"));
      User user = obj.doExecute(4);
      System.out.println(user.id);
      System.out.println(user.name);
   }
}