package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 18.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.xml");
//        Processor processor = context.getBean("defaultProcessor", Processor.class);
//        Processor processor = context.getBean("xmlProcessor", Processor.class);
//        processor.process();
//        Processor processor = new DefaultProcessorImpl();
//        DataService dataService = new DataService(processor);


//   Вместо того, чтобы создавать processor для каждой имплементации Processor(закомментированніе строчки сверху), а
//   потом создавать new DataService,мы просто пишем dataService = context.getBean(com.app.DataService.class).
//   А какую именно имплементацию выбрать прописываем в теге constructor-arg в бине bean id="dataService" в spring-config.xml
//         (<bean id="dataService" class="com.app.DataService">
//        <constructor-arg index="0" ref="defaultProcessor"></constructor-arg>
//          </bean>)
        DataService dataService = context.getBean(com.app.DataService.class);
//        DataService dataService = (DataService) context.getBean("dataService"); //можно bean создавать
// по id("dataService" в spring-config.xml) или по классу com.app.DataService.class
        dataService.makeAction();
    }
}
