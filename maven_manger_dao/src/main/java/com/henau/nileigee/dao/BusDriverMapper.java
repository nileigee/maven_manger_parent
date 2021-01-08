package com.henau.nileigee.dao;

import com.henau.nileigee.domain.BusDriver;

import java.io.IOException;
import java.util.List;

public interface BusDriverMapper {
    public List<BusDriver> queryAllDriver() throws IOException;
    public BusDriver queryDriverById(int drId) throws IOException;
    public void addBusDriver(BusDriver busDriver) throws IOException;
    public void deleteBusDriver(int  drId) throws IOException;

    public int queryCount() throws IOException;
}
