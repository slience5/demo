package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class AnnotationAutoWiredDemo {

    @Autowired
    private User user;

    public static void main(String[] args) {
        // 创建beanFactory
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册bean
        context.register(AnnotationAutoWiredDemo.class);
        // 加载xml 解析beanDefinition
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions("spring/depency-lookup-context.xml");
        // 启动spring 应用上下文
        context.refresh();

        AnnotationAutoWiredDemo demo = context.getBean(AnnotationAutoWiredDemo.class);

        System.out.println("demo user = " + demo.user);

        // 关闭Spring 应用上下文
        context.close();
    }
}
