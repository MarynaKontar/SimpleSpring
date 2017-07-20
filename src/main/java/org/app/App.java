package org.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 19.07.2017.
 */
@Configuration
//@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.app"} )
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("/annotation-config.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext("/annotation-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//
//        CompactDisk compactDisk = context.getBean(DiskImpl1.class);
//        compactDisk.play();
//        context.getBean("musicService");
//        context.getBean(org.app.MusicService.class);
//         MusicService musicService = (MusicService) context.getBean("musicService");
         MusicService musicService = context.getBean(org.app.MusicService.class);
          musicService.makeAction();
    }
}
