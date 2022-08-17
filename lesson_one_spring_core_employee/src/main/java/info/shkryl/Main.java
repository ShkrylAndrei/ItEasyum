package info.shkryl;

import info.shkryl.bean.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee);
    }
}
