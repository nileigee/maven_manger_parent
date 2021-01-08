package com.henau.nileigee.dao.impl;

import com.henau.nileigee.dao.BusLineMapper;
import com.henau.nileigee.domain.BusLine;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BusLineMapperImpl implements BusLineMapper {
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    public BusLineMapperImpl() throws IOException {
    }

    public List<BusLine> queryAllLine() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusLineMapper mapper = sqlSession.getMapper(BusLineMapper.class);
        List<BusLine> busLines = mapper.queryAllLine();
        sqlSession.close();
        return busLines;
    }

    public BusLine queryLineById(int lineId) throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusLineMapper mapper = sqlSession.getMapper(BusLineMapper.class);
        BusLine busLine = mapper.queryLineById(lineId);
        sqlSession.close();
        return busLine;
    }

    public void addBusLine(BusLine busLine) throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusLineMapper mapper = sqlSession.getMapper(BusLineMapper.class);
        mapper.addBusLine(busLine);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteBusLine(int lineId) throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusLineMapper mapper = sqlSession.getMapper(BusLineMapper.class);
        mapper.deleteBusLine(lineId);
        sqlSession.commit();
        sqlSession.close();
    }

    public int queryCount() throws IOException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BusLineMapper mapper = sqlSession.getMapper(BusLineMapper.class);
        int count = mapper.queryCount();
        sqlSession.close();
        return count;
    }
}
