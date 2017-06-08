package delegateBean;

import org.springframework.stereotype.Component;

@Component("myBean")
public class HelloBean {

    private String say="123";

    public String saySomething() {
        return say;
    }

}