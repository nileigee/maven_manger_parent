package com.henau.nileigee.service.impl;

import com.henau.nileigee.dao.BusTeamMapper;
import com.henau.nileigee.domain.BusTeam;
import com.henau.nileigee.service.BusTeamService;

import java.io.IOException;
import java.util.List;

public class BusTeamServiceImpl implements BusTeamService{
    private BusTeamMapper busTeamMapper;

    public void setBusTeamMapper(BusTeamMapper busTeamMapper) {
        this.busTeamMapper = busTeamMapper;
    }


    public List<BusTeam> queryAllTeam() throws IOException {
        List<BusTeam> busTeams = busTeamMapper.queryAllTeam();
        return busTeams;
    }

    public BusTeam queryTeamById(int busId) throws IOException {
        BusTeam busTeam = busTeamMapper.queryTeamById(busId);
        return busTeam;
    }

    public void addBusTeam(BusTeam busTeam) throws IOException {
       busTeamMapper.addBusTeam(busTeam);
    }

    public void deleteBusTeam(int busId) throws IOException {
       busTeamMapper.deleteBusTeam(busId);
    }

    public int queryCount() throws IOException {
        int count = busTeamMapper.queryCount();
        return count;
    }
}
