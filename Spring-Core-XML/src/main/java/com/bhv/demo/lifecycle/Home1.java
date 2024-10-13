package com.bhv.demo.lifecycle;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@NoArgsConstructor
public class Home1 implements InitializingBean,DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("Setter Called");
        this.name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean Called");
    }
}
