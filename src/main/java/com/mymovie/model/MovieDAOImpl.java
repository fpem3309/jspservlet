package com.mymovie.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAOImpl implements MovieDAO{

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<MovieVO> movieList(MovieVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		List<MovieVO> list = session.selectList("movieList",vo);
		session.close();
		return list;
	}
}
