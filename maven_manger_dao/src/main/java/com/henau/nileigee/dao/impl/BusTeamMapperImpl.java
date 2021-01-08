package com.henau.nileigee.dao.impl;

import com.henau.nileigee.dao.BusTeamMapper;
import com.henau.nileigee.domain.BusTeam;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BusTeamMapperImpl implements BusTeamMapper {

    public List<BusTeam> queryAllTeam() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusTeamMapper mapper = sqlSession.getMapper(BusTeamMapper.class);
        List<BusTeam> busTeams = mapper.queryAllTeam();
        sqlSession.close();
        return busTeams;
    }

    public BusTeam queryTeamById(int busId) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusTeamMapper mapper = sqlSession.getMapper(BusTeamMapper.class);
        BusTeam busTeam = mapper.queryTeamById(busId);
        sqlSession.close();
        return busTeam;
    }

    public void addBusTeam(BusTeam busTeam) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusTeamMapper mapper = sqlSession.getMapper(BusTeamMapper.class);
        mapper.addBusTeam(busTeam);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteBusTeam(int busId) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusTeamMapper mapper = sqlSession.getMapper(BusTeamMapper.class);
        mapper.deleteBusTeam(busId);
        sqlSession.commit();
        sqlSession.close();
    }

    public int queryCount() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusTeamMapper mapper = sqlSession.getMapper(BusTeamMapper.class);
        int count = mapper.queryCount();
        sqlSession.close();
        return count;
    }
}
