package com.henau.nileigee.dao;

import com.henau.nileigee.domain.BusLine;

import java.io.IOException;
import java.util.List;

public interface BusLineMapper {
    public List<BusLine> queryAllLine() throws IOException;
    public BusLine queryLineById(int lineId) throws IOException;
    public void addBusLine(BusLine busLine) throws IOException;
    public void deleteBusLine(int  lineId) throws IOException;

    public int queryCount() throws IOException;
}
