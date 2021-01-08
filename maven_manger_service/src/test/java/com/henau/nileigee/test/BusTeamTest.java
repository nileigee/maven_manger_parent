package com.henau.nileigee.test;

import com.henau.nileigee.domain.BusDriver;
import com.henau.nileigee.domain.BusTeam;
import com.henau.nileigee.service.BusDriverService;
import com.henau.nileigee.service.BusTeamService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class BusTeamTest {
    @Test
    public void test1() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusTeamService busTeamService = app.getBean(BusTeamService.class);
        List<BusTeam> busTeams = busTeamService.queryAllTeam();
        for (BusTeam team : busTeams) {
            System.out.println(team);
        }
    }

    @Test
    public void test2() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusTeamService busTeamService = app.getBean(BusTeamService.class);
        BusTeam busTeam = busTeamService.queryTeamById(20053);
        System.out.println(busTeam);

    }

    @Test
    public void test3() throws IOException {
        BusTeam busTeam=new BusTeam();
        busTeam.setCarName("仙队");
        busTeam.setAdministratorId(9999);
        busTeam.setComNumber(9009);
        busTeam.setLineId(9);
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusTeamService busTeamService = app.getBean(BusTeamService.class);
        busTeamService.addBusTeam(busTeam);
        System.out.println(busTeam);

    }

    @Test
    public void test4() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusTeamService busTeamService = app.getBean(BusTeamService.class);
        busTeamService.deleteBusTeam(20056);

    }

    @Test
    public void test5() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        BusTeamService busTeamService = app.getBean(BusTeamService.class);
        int count = busTeamService.queryCount();
        System.out.println(count);
    }
}
