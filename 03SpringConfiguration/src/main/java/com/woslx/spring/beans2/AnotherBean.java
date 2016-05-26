package com.woslx.spring.beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by hy on 16-5-26.
 */
@Component(value = "anotherBean")
public class AnotherBean {

    private MyBean myBean;

    public MyBean getMyBean() {
        return myBean;
    }

    @Autowired
    @Qualifier("myBean2")
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    @Override
    public String toString() {
        return "AnotherBean [myBean=" + myBean + "]";
    }
}
