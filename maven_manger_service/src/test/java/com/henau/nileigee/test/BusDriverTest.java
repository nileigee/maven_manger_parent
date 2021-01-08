package com.henau.nileigee.test;

import com.henau.nileigee.domain.BusDriver;
import com.henau.nileigee.domain.CarInfo;
import com.henau.nileigee.service.BusDriverService;
import com.henau.nileigee.service.CarInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class BusDriverTest {
    @Test
    public void test1() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusDriverService busDriverService = app.getBean(BusDriverService.class);
        List<BusDriver> busDrivers = busDriverService.queryAllDriver();
        for (BusDriver driver : busDrivers) {
            System.out.println(driver);
        }
    }

    @Test
    public void test2() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusDriverService busDriverService = app.getBean(BusDriverService.class);
        BusDriver busDriver = busDriverService.queryDriverById(9910);
        System.out.println(busDriver);

    }

    @Test
    public void test3() throws IOException {
        BusDriver busDriver=new BusDriver();
                  busDriver.setDrName("画中仙");
                  busDriver.setDrTel("999999");
                  busDriver.setStatus(1);
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusDriverService busDriverService = app.getBean(BusDriverService.class);
        busDriverService.addBusDriver(busDriver);
        System.out.println(busDriver);

    }

    @Test
    public void test4() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusDriverService busDriverService = app.getBean(BusDriverService.class);
        busDriverService.deleteBusDriver(10012);

    }

    @Test
    public void test5() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusDriverService busDriverService = app.getBean(BusDriverService.class);
        int count = busDriverService.queryCount();
        System.out.println(count);
    }
}
