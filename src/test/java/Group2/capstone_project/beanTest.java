package Group2.capstone_project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.access.SecurityConfig;

public class beanTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SecurityConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] beadDefinitionNames = ac.getBeanDefinitionNames();
        for(String beanDefinitionName : beadDefinitionNames ) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("bean="+beanDefinitionName+"object =" +bean);
        }
    }

}

