package com.henau.nileigee.service;

import com.henau.nileigee.domain.BusStop;

import java.io.IOException;
import java.util.List;

public interface BusStopService {
    public List<BusStop> queryAllStop() throws IOException;
    public BusStop queryStopById(int stopId) throws IOException;
    public void addBusStop(BusStop busStop) throws IOException;
    public void deleteBusStop(int  stopId) throws IOException;

    public int queryCount() throws IOException;
}
