package com.henau.nileigee.test;

import com.henau.nileigee.domain.BusLine;
import com.henau.nileigee.domain.BusTeam;
import com.henau.nileigee.service.BusLineService;
import com.henau.nileigee.service.BusTeamService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class BusLineTest {
    @Test
    public void test1() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusLineService busLineService = app.getBean(BusLineService.class);
        List<BusLine> busLines = busLineService.queryAllLine();
        for (BusLine busLine : busLines) {
            System.out.println(busLine);
        }

    }

    @Test
    public void test2() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusLineService busLineService = app.getBean(BusLineService.class);
        BusLine busLine = busLineService.queryLineById(4);
        System.out.println(busLine);
    }

    @Test
    public void test3() throws IOException {
        BusLine busLine=new BusLine();
        busLine.setLineName("niLeiGee");
        busLine.setComNumber(3001);
        busLine.setLineType("短途");
        busLine.setUpLength(20);
        busLine.setDownLength(20);
        busLine.setUpStartTime("06:20:30");
        busLine.setUpOverTime("20:30:30");
        busLine.setDownStartTime("06:20:30");
        busLine.setDownOverTime("20:30:30");
        busLine.setStatus(0);
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusLineService busLineService = app.getBean(BusLineService.class);
        busLineService.addBusLine(busLine);

    }

    @Test
    public void test4() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusLineService busLineService = app.getBean(BusLineService.class);
        busLineService.deleteBusLine(17);
    }

    @Test
    public void test5() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusLineService busLineService = app.getBean(BusLineService.class);
        int count = busLineService.queryCount();
        System.out.println(count);
    }
}
