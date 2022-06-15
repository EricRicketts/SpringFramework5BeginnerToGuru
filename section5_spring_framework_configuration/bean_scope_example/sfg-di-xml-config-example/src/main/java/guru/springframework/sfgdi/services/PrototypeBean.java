package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    private String beanCreation;

    public PrototypeBean() {
        this.beanCreation = "Created a Prototype Bean in constructor.";
    }

    public String getMyScope() {
        return "I am a Prototype Bean.";
    }
}
