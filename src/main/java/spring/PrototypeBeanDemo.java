package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class PrototypeBeanDemo {

    @Autowired
    private User user;

    @Autowired
    private User user1;

    @Autowired
    private User user2;

    public static void main(String[] args) {
        // 创建beanFactory
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册bean
        context.register(PrototypeBeanDemo.class);
        // 加载xml 解析beanDefinition
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions("spring/depency-lookup-context.xml");
        // 启动spring 应用上下文
        context.refresh();

        PrototypeBeanDemo demo = context.getBean(PrototypeBeanDemo.class);

        System.out.println("demo user = " + demo.user);

        System.out.println("demo user = " + demo.user1);

        System.out.println("demo user = " + demo.user2);

        System.out.println(demo.user == demo.user1);

        System.out.println(demo.user2 == demo.user1);

        // 关闭Spring 应用上下文
        context.close();
    }
}
