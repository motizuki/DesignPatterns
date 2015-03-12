package com.edu.designpattern.structural;

import static org.junit.Assert.*;

import com.edu.common.exampleclasses.Vehicle;
import com.edu.common.exampleclasses.WhiteGoods;
import com.edu.designpattern.structural.facade.HybridVehicle;
import com.edu.springconfigclasses.ConfigFacade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.annotation.Resource;

/**
 * Created by gustavokm90 on 3/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfigFacade.class, loader=AnnotationConfigContextLoader.class)

public class TestFacade {

    @Resource(name = "hybridVehicle")
    private HybridVehicle hybridVehicle;
    @Resource(name = "car")
    private Vehicle car;
    @Resource(name = "boat")
    private Vehicle boat;
    @Resource(name = "oven")
    private WhiteGoods oven;

    @Before
    public void setUp() throws Exception {
        System.out.println("Preparing tests");

    }

    @Test
    public void testFacadeBeans() throws Exception {
        assertNotNull(car);
        assertNotNull(boat);
        assertNotNull(oven);

        assertEquals("This vehicle does not need wheels",boat.wheels());
        assertEquals("This vehicle cost $20000.0",boat.price());

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Finalizing tests");

    }
}
