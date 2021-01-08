package com.henau.nileigee.service;


import com.henau.nileigee.domain.CarInfo;

import java.io.IOException;
import java.util.List;

public interface CarInfoService {
    public List<CarInfo> queryAllCar() throws IOException;
    public CarInfo queryCarById(int carId) throws IOException;
    public void addCarInfo(CarInfo carInfo) throws IOException;
    public void deleteCar(int  carId) throws IOException;

    public int queryCount() throws IOException;
}
