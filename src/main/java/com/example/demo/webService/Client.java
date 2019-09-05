package com.example.demo.webService;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        try {
            // 接口地址
            String address = "http://localhost:8080/services/Service?wsdl";
            // 代理工厂
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress(address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass(Service.class);
            // 创建一个代理接口实现
            Service cs = (Service) jaxWsProxyFactoryBean.create();
            // 数据准备
            String userName = "宫本";
            // 调用代理接口的方法调用并返回结果
            String result = cs.HelloWorld(userName);
            System.out.println("调用服务器成功！");
            System.out.println("返回结果:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
