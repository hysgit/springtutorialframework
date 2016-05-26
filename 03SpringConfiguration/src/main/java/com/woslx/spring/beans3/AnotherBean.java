package com.woslx.spring.beans3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hy on 16-5-26.
 */
public class AnotherBean {
    private MyBean myBean;

    public MyBean getMyBean() {
        return myBean;
    }

    @Autowired
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    @Override
    public String toString() {
        return "AnotherBean [myBean=" + myBean + "]";
    }
}
