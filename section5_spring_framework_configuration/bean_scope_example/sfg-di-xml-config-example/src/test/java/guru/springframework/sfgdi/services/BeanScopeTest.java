package guru.springframework.sfgdi.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class BeanScopeTest {

    @Autowired
    ApplicationContext context;
    SingletonBean singletonBeanOne, singletonBeanTwo;
    PrototypeBean prototypeBeanOne, prototypeBeanTwo;

    @BeforeEach
    public void setUp() {
        singletonBeanOne = context.getBean(SingletonBean.class);
        singletonBeanTwo = context.getBean(SingletonBean.class);
        prototypeBeanOne = context.getBean(PrototypeBean.class);
        prototypeBeanTwo = context.getBean(PrototypeBean.class);
    }

    @Test
    public void testSingletonBeans() {
        assertTrue(singletonBeanOne == singletonBeanTwo);
    }

    @Test
    public void testPrototypeBeans() {
        assertFalse(prototypeBeanOne == prototypeBeanTwo);
    }
}
