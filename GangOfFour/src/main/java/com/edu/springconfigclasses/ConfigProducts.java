package com.edu.springconfigclasses;

import com.edu.common.exampleclasses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gustavokm90 on 3/12/15.
 */
@Configuration
public class ConfigProducts {

    private static final Logger logger = LoggerFactory.getLogger(ConfigProducts.class);

    @Bean(name = "car")
    public Vehicle car(){
        logger.info("SPRING - Configuring car bean");
        return new Car();
    }
    @Bean(name = "boat")
    public Vehicle boat(){
        logger.info("SPRING - Configuring boat bean");
        return new Boat();
    }

    @Bean(name = "oven")
    public WhiteGoods oven(){
        logger.info("SPRING - Configuring oven bean");
        return new Oven();
    }
}
