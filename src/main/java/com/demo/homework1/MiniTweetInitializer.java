package com.demo.homework1;

import com.demo.homework1.configuration.MiniTweetConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by vagrant on 11/30/16.
 */
public class MiniTweetInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() { return new Class[]{MiniTweetConfiguration.class};}

    @Override
    protected Class<?>[] getServletConfigClasses() { return null;}

    @Override
    protected String[] getServletMappings() {return new String[] {"/"};}
}
