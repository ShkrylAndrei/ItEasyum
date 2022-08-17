package info.shkryl;


import info.shkryl.bean.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class TestContext {
    @Test
    void TestContext(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Employee employee = context.getBean("employee",Employee.class);

        Assert.notNull(employee);
    }
}
