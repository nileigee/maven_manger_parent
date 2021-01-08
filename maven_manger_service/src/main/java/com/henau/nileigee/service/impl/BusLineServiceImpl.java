package com.henau.nileigee.service.impl;

import com.henau.nileigee.dao.BusLineMapper;
import com.henau.nileigee.domain.BusLine;
import com.henau.nileigee.service.BusLineService;

import java.io.IOException;
import java.util.List;

public class BusLineServiceImpl implements BusLineService {
    private BusLineMapper busLineMapper;

    public void setBusLineMapper(BusLineMapper busLineMapper) {
        this.busLineMapper = busLineMapper;
    }

    public List<BusLine> queryAllLine() throws IOException {
        List<BusLine> busLines = busLineMapper.queryAllLine();
        return busLines;
    }

    public BusLine queryLineById(int lineId) throws IOException {
        BusLine busLine = busLineMapper.queryLineById(lineId);
        return busLine;
    }

    public void addBusLine(BusLine busLine) throws IOException {
        busLineMapper.addBusLine(busLine);
    }

    public void deleteBusLine(int lineId) throws IOException {
        busLineMapper.deleteBusLine(lineId);
    }

    public int queryCount() throws IOException {
        int count = busLineMapper.queryCount();
        return count;
    }
}
