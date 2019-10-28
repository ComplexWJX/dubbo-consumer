package com.asiainfo;

import com.wq.service.IRemoteServerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config/consumer-context.xml"});
        context.start();
        // Obtaining a remote service proxy
        IRemoteServerService remoteServerService = (IRemoteServerService)context.getBean("remoteServerService");
        // Executing remote methods
        Object result = remoteServerService.process();
        // Display the call result
        System.out.println(result);
    }
}
