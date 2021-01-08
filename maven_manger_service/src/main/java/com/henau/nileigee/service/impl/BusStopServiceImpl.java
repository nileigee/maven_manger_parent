package com.henau.nileigee.service.impl;

import com.henau.nileigee.dao.BusStopMapper;
import com.henau.nileigee.domain.BusStop;
import com.henau.nileigee.service.BusStopService;

import java.io.IOException;
import java.util.List;

public class BusStopServiceImpl implements BusStopService {

    private BusStopMapper busStopMapper;

    public void setBusStopMapper(BusStopMapper busStopMapper) {
        this.busStopMapper = busStopMapper;
    }

    public List<BusStop> queryAllStop() throws IOException {
        List<BusStop> busStops = busStopMapper.queryAllStop();
        return busStops;
    }

    public BusStop queryStopById(int stopId) throws IOException {
        BusStop busStop = busStopMapper.queryStopById(stopId);
        return busStop;
    }

    public void addBusStop(BusStop busStop) throws IOException {
      busStopMapper.addBusStop(busStop)
      ;
    }

    public void deleteBusStop(int stopId) throws IOException {
      busStopMapper.deleteBusStop(stopId);
    }

    public int queryCount() throws IOException {
        int count = busStopMapper.queryCount();
        return count;
    }
}
