package com.mkyong.helloworld.security.config.core;

/**
 * Created by dgup27 on 1/3/2017.
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.mkyong.helloworld.security.config.LoginApplicationConfig;

public class SpringMVCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { LoginApplicationConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
