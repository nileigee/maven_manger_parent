package com.henau.nileigee.service;

import com.henau.nileigee.domain.BusLine;

import java.io.IOException;
import java.util.List;

public interface BusLineService {
    public List<BusLine> queryAllLine() throws IOException;
    public BusLine queryLineById(int lineId) throws IOException;
    public void addBusLine(BusLine busLine) throws IOException;
    public void deleteBusLine(int  lineId) throws IOException;

    public int queryCount() throws IOException;
}
