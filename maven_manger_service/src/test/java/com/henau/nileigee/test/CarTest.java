package com.henau.nileigee.test;


import com.henau.nileigee.domain.CarInfo;
import com.henau.nileigee.service.CarInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class CarTest {
    /*
    * 查询所有车辆
    * */
    @Test
    public void test1() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        CarInfoService carInfoService = app.getBean(CarInfoService.class);
        List<CarInfo> carInfoList = carInfoService.queryAllCar();
        for (CarInfo carInfo : carInfoList) {
            System.out.println(carInfo);
        }
    }

    /*
    * 根据id查询某车
    *
    * */
    @Test
    public void test2() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        CarInfoService carInfoService = app.getBean(CarInfoService.class);
        CarInfo carInfo = carInfoService.queryCarById(104);
        System.out.println(carInfo);

    }
    /*
    *增加车辆
    * */
    @Test
    public void test3() throws IOException {
        CarInfo carInfo=new CarInfo();
        carInfo.setNumber("画B0002");
        carInfo.setCarColor("红色");
        carInfo.setTeamId(20001);
        carInfo.setType("宇通");
        carInfo.setBelongCompany(2);
        carInfo.setSetnum(66);
        carInfo.setBusMasterId(9999);
        carInfo.setStatus(0);
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        CarInfoService carInfoService = app.getBean(CarInfoService.class);
        carInfoService.addCarInfo(carInfo);
        System.out.println(carInfo);

    }
    /**
     * 根据id删除某组车辆数据
     */
    @Test
    public void test4() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        CarInfoService carInfoService = app.getBean(CarInfoService.class);
        carInfoService.deleteCar(107);

    }

    @Test
    public void test5() throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        CarInfoService carInfoService = app.getBean(CarInfoService.class);
        int count = carInfoService.queryCount();
        System.out.println(count);

    }
}
