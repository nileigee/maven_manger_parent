package com.henau.nileigee.dao.impl;

import com.henau.nileigee.dao.CarInfoMapper;
import com.henau.nileigee.domain.CarInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CarInfoMapperImpl implements CarInfoMapper {
    public List<CarInfo> queryAllCar() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CarInfoMapper carInfoMapper = sqlSession.getMapper(CarInfoMapper.class);
        List<CarInfo> carInfoList = carInfoMapper.queryAllCar();
        sqlSession.close();
        return carInfoList;
    }

    public CarInfo queryCarById(int carId) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /*CarInfo carInfo = (CarInfo) sqlSession.selectOne("CarInfoMapper.queryCarById", carId);*/
        CarInfoMapper mapper = sqlSession.getMapper(CarInfoMapper.class);
        CarInfo carInfo = mapper.queryCarById(carId);
        sqlSession.close();
        return carInfo;
    }

    public void addCarInfo(CarInfo carInfo) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);//test的意思是数据库操作的是test环境
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /*sqlSession.insert("CarInfoMapper.addCarInfo", carInfo);*/
        CarInfoMapper mapper = sqlSession.getMapper(CarInfoMapper.class);
        mapper.addCarInfo(carInfo);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteCar(int carId) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /*sqlSession.delete("CarInfoMapper.deleteCar",carId);*/
        CarInfoMapper mapper = sqlSession.getMapper(CarInfoMapper.class);
        mapper.deleteCar(carId);
        sqlSession.commit();
        sqlSession.close();
    }

    public int queryCount() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CarInfoMapper mapper = sqlSession.getMapper(CarInfoMapper.class);
        int count = mapper.queryCount();
        return count;
    }
}
