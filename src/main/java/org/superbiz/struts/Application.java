package org.superbiz.struts;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

//
//    @Bean
//    public FilterRegistrationBean filterDispatch() {
//        return buildFilterRegistration(2, new StrutsPrepareAndExecuteFilter(),
//            asList("/findUserForm.action", "/findUser.action",
//                "/listAllUsers.action"));
//    }

//    @Bean
//    public FilterRegistrationBean sitemeshPageFilter() {
//        return buildFilterRegistration(1, new SiteMeshFilter(),
//            singletonList("/*"));
//    }

    /*private FilterRegistrationBean buildFilterRegistration(int order, Filter filter, List<String> urlPatterns) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filter);
        registration.setUrlPatterns(urlPatterns);
        registration.setOrder(order);
        return registration;
    }*/
}
