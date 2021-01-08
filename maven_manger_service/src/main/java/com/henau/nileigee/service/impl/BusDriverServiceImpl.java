package com.henau.nileigee.service.impl;

import com.henau.nileigee.dao.BusDriverMapper;
import com.henau.nileigee.domain.BusDriver;
import com.henau.nileigee.service.BusDriverService;

import java.io.IOException;
import java.util.List;

public class BusDriverServiceImpl implements BusDriverService {

    private BusDriverMapper busDriverMapper;

    public void setBusDriverMapper(BusDriverMapper busDriverMapper) {
        this.busDriverMapper = busDriverMapper;
    }

    public List<BusDriver> queryAllDriver() throws IOException {
        List<BusDriver> busDrivers = busDriverMapper.queryAllDriver();
        return busDrivers;
    }

    public BusDriver queryDriverById(int drId) throws IOException {
        BusDriver busDriver = busDriverMapper.queryDriverById(drId);
        return busDriver;
    }

    public void addBusDriver(BusDriver busDriver) throws IOException {
        busDriverMapper.addBusDriver(busDriver);
    }

    public void deleteBusDriver(int drId) throws IOException {
        busDriverMapper.deleteBusDriver(drId);

    }

    public int queryCount() throws IOException {
        int count = busDriverMapper.queryCount();
        return count;
    }
}
