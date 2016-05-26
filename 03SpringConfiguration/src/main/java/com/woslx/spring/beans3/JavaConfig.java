package com.woslx.spring.beans3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hy on 16-5-26.
 */
@Configuration
public class JavaConfig {
    @Bean
    public MyBean myBean(){
        return  new MyBean();
    }

    @Bean(name = "anotherBean2")
    public AnotherBean anotherBean(){
        return new AnotherBean();
    }
}
