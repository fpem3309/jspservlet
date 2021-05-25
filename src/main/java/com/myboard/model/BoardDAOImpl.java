package com.myboard.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<BoardVO> boardList(BoardVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		List<BoardVO> list = session.selectList("boardList",vo);
		session.close();
		return list;
	}
}
