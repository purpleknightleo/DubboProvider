package com.lee.demo.dubbo.service;

import com.lee.demo.dubbo.service.facade.DemoFacade;

/**
 * Created by hzlifan on 2017/2/21.
 */
public class DemoFacadeImpl implements DemoFacade {

    @Override
    public String test(String str){
       return "str = " + str;
    }

}
