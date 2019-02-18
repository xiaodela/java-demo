package org.mzy.action;

import org.apache.struts2.convention.annotation.*;

@ParentPackage("basePackage")
@Action(value="strust2Test")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
@Results( { @Result(name = "success", location = "/success.jsp"),
        @Result(name = "input", location = "/register.jsp") })
public class TestAction {


    /**
     * http://localhost:8080/SSHE/strust2Test!test.action
     * MethodName: test
     * Description:
     * @author xudp
     */
    public String test(){
        System.out.println("进入TestAction");
        return "success";
    }
}
/*
---------------------
        作者：fenyu8
        来源：CSDN
        原文：https://blog.csdn.net/fenyu8/article/details/52997784
        版权声明：本文为博主原创文章，转载请附上博文链接！
*/
