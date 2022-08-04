package com.wzfhhj.project.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Test1Application.class);

        Environment env = applicationContext.getEnvironment();

        String ip;
        try
        {
            ip = InetAddress.getLocalHost().getHostAddress();
        }
        catch (Exception e)
        {
            ip = "";
        }

        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        System.out.println("\n-------------------------------------------------\n"+
                "Access URLs:\n"+
                "External: http://"+ip+":"+port+path+"\n"+
                "-------------------------------------------");

    }

}
