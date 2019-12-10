package org.superbiz.struts;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean siteMeshFilter() {
        FilterRegistrationBean<SiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new SiteMeshFilter()); // adding sitemesh filter ??
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        //filterRegistrationBean.addUrlPatterns("/decorators/layout.jsp");
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean strutsPrepareAndExecuteFilter() {
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> registrationBean = new FilterRegistrationBean<>();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.addUrlPatterns("/");
        registrationBean.addUrlPatterns("/addUserForm.action");
        registrationBean.addUrlPatterns("/addUser.action");
        registrationBean.addUrlPatterns("/findUserForm.action");
        registrationBean.addUrlPatterns("/findUser.action");
        registrationBean.addUrlPatterns("/listAllUsers.action");
        registrationBean.setOrder(2);
        return registrationBean;
    }
}
