package com.henau.nileigee.test;


import com.henau.nileigee.domain.BusStop;
import com.henau.nileigee.service.BusStopService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class BusStopTest {
    @Test
    public void test1() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusStopService busStopService = app.getBean(BusStopService.class);
        List<BusStop> busStops = busStopService.queryAllStop();
        for (BusStop busStop : busStops) {
            System.out.println(busStop);
        }
    }

    @Test
    public void test2() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusStopService busStopService = app.getBean(BusStopService.class);
        BusStop busStop = busStopService.queryStopById(3);
        System.out.println(busStop);
    }

    @Test
    public void test3() throws IOException {
        BusStop busStop=new BusStop();
        busStop.setStopName("画中仙路");
        busStop.setStopDirection("上行");
        busStop.setStopType("大型站点");
        busStop.setArrivalLongitude(112.666666);
        busStop.setArrivalLatitude(45.666666);
        busStop.setStopLongitude(112.666666);
        busStop.setStopLatitude(45.666666);
        busStop.setExitLongitude(112.666666);
        busStop.setExitLatitude(45.666666);
        busStop.setStopSpeed(60);
        busStop.setStopProvince("河南");
        busStop.setStopCity("南阳");
        busStop.setStopAreaId(6);
        busStop.setStopText("GOOD!");
        busStop.setStopStatus(1);
        busStop.setStopXuni(0);
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusStopService busStopService = app.getBean(BusStopService.class);
        busStopService.addBusStop(busStop);
        System.out.println(busStop);
    }

    @Test
    public void test4() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusStopService busStopService = app.getBean(BusStopService.class);
        busStopService.deleteBusStop(66);

    }

    @Test
    public void test5() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusStopService busStopService = app.getBean(BusStopService.class);
        int count = busStopService.queryCount();
        System.out.println(count);
    }
}
