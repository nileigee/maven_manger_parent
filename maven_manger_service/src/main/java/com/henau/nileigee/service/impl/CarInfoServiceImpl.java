package com.henau.nileigee.service.impl;

import com.henau.nileigee.dao.CarInfoMapper;
import com.henau.nileigee.domain.CarInfo;
import com.henau.nileigee.service.CarInfoService;

import java.io.IOException;
import java.util.List;

public class CarInfoServiceImpl implements CarInfoService {

    private CarInfoMapper carInfoMapper;

    public void setCarInfoMapper(CarInfoMapper carInfoMapper) {
        this.carInfoMapper = carInfoMapper;
    }

    public List<CarInfo> queryAllCar() throws IOException {
        List<CarInfo> carInfoList = carInfoMapper.queryAllCar();
        return carInfoList;
    }

    public CarInfo queryCarById(int carId) throws IOException {
        CarInfo carInfo = carInfoMapper.queryCarById(carId);
        return carInfo;
    }

    public void addCarInfo(CarInfo carInfo) throws IOException {
          carInfoMapper.addCarInfo(carInfo);
    }

    public void deleteCar(int carId) throws IOException {
          carInfoMapper.deleteCar(carId);
    }

    public int queryCount() throws IOException {
        int count = carInfoMapper.queryCount();
        return count;
    }
}
