package com.edu.springconfigclasses;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * Created by gustavokm90 on 3/13/15.
 */
@Aspect
@Configuration
@EnableAspectJAutoProxy
@Import({ConfigExampleClasses.class})
public class ConfigComposite {

}
