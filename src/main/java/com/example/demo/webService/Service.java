package com.example.demo.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "Service", targetNamespace = "http://www.webService.demo.example.com")//服务名称及命名空间
public interface Service {

    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String HelloWorld(@WebParam(name = "HelloName") String name);
}
