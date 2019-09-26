package com.stackroute.java;

import com.stackroute.java.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "display",method = RequestMethod.GET)
    public ModelAndView user(ModelMap model, @RequestParam(value = "firstname") String userName, @RequestParam(value = "password") String password)
    {
////        FileSystemXmlApplicationContext beanFactory=new FileSystemXmlApplicationContext("dispatcher-servlet.xml");
//       ApplicationContext context=new ClassPathXmlApplicationContext("/home/cgi/Documents/Stackroute/Java/MVCExercise2/src/main/webapp/WEB-INF/dispatcher-servlet.xml");
//        User user=context.getBean("user",User.class);
        User user=new User();
        user.setName(userName);
        user.setPassword(password);
        System.out.println(user.getName());
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
