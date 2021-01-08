package com.henau.nileigee.dao.impl;

import com.henau.nileigee.dao.BusDriverMapper;
import com.henau.nileigee.dao.CarInfoMapper;
import com.henau.nileigee.domain.BusDriver;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BusDriverMapperImpl implements BusDriverMapper {
    public List<BusDriver> queryAllDriver() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusDriverMapper mapper = sqlSession.getMapper(BusDriverMapper.class);
        List<BusDriver> busDrivers = mapper.queryAllDriver();
        sqlSession.close();
        return busDrivers;
    }

    public BusDriver queryDriverById(int drId) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusDriverMapper mapper = sqlSession.getMapper(BusDriverMapper.class);
        BusDriver busDriver = mapper.queryDriverById(drId);
        sqlSession.close();
        return busDriver;
    }

    public void addBusDriver(BusDriver busDriver) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusDriverMapper mapper = sqlSession.getMapper(BusDriverMapper.class);
        mapper.addBusDriver(busDriver);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteBusDriver(int drId) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusDriverMapper mapper = sqlSession.getMapper(BusDriverMapper.class);
        mapper.deleteBusDriver(drId);
        sqlSession.commit();
        sqlSession.close();
    }

    public int queryCount() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusDriverMapper mapper = sqlSession.getMapper(BusDriverMapper.class);
        int count = mapper.queryCount();
        return count;
    }
}
