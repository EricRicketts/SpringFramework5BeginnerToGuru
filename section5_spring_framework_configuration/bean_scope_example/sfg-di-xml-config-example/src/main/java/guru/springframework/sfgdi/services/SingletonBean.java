package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private String beanCreation;

    public SingletonBean() {
        this.beanCreation = "Created a Singleton Bean in constructor.";
    }

    public String getMyScope() {
        return "I am a Singleton Bean.";
    }
}
