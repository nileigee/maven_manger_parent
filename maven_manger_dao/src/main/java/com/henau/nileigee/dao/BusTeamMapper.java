package com.henau.nileigee.dao;

import com.henau.nileigee.domain.BusTeam;

import java.io.IOException;
import java.util.List;

public interface BusTeamMapper {
    public List<BusTeam> queryAllTeam() throws IOException;
    public BusTeam queryTeamById(int busId) throws IOException;
    public void addBusTeam(BusTeam busTeam) throws IOException;
    public void deleteBusTeam(int  busId) throws IOException;

    public int queryCount() throws IOException;
}
