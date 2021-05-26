package com.myboard.model;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{

	private static final String NAMESPACE = "com.myboard.mybatis.Board";
	
	//private SqlSessionFactory sqlSessionFactory;

	private SqlSession sqlSession;
	
	@Inject
	public BoardDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	/*@Override
	public List<BoardVO> boardList(BoardVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		List<BoardVO> list = session.selectList("boardList",vo);
		session.close();
		return list;
	}*/

	@Override
	public void create(BoardVO boardVO) throws Exception {
		sqlSession.insert(NAMESPACE+".create",boardVO);
		
	}

	@Override
	public BoardVO read(Integer boardVO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+".read",boardVO);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		sqlSession.update(NAMESPACE+".update",boardVO);
	}

	@Override
	public void delete(Integer boardVO) throws Exception {
		sqlSession.delete(NAMESPACE+".delete",boardVO);
	}

	@Override
	public List listAll() throws Exception {
		return sqlSession.selectList(NAMESPACE+".listAll");
	}
}
