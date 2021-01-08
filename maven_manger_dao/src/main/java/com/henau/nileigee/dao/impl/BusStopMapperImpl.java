package com.henau.nileigee.dao.impl;

import com.henau.nileigee.dao.BusStopMapper;
import com.henau.nileigee.domain.BusStop;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BusStopMapperImpl implements BusStopMapper {
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    public BusStopMapperImpl() throws IOException {
    }

    public List<BusStop> queryAllStop() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusStopMapper mapper = sqlSession.getMapper(BusStopMapper.class);
        List<BusStop> busStops = mapper.queryAllStop();
        sqlSession.close();
        return busStops;
    }

    public BusStop queryStopById(int stopId) throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusStopMapper mapper = sqlSession.getMapper(BusStopMapper.class);
        BusStop busStop = mapper.queryStopById(stopId);
        sqlSession.close();
        return busStop;
    }

    public void addBusStop(BusStop busStop) throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusStopMapper mapper = sqlSession.getMapper(BusStopMapper.class);
        mapper.addBusStop(busStop);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteBusStop(int stopId) throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusStopMapper mapper = sqlSession.getMapper(BusStopMapper.class);
        mapper.deleteBusStop(stopId);
        sqlSession.commit();
        sqlSession.close();
    }

    public int queryCount() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusStopMapper mapper = sqlSession.getMapper(BusStopMapper.class);
        int count = mapper.queryCount();
        sqlSession.close();
        return count;
    }
}
