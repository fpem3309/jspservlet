package com.myboard.model;

import java.util.List;

public interface BoardDAO {
	//public List<BoardVO> boardList(BoardVO vo);
	void create(BoardVO boardVO) throws Exception;
	BoardVO read(Integer boardVO) throws Exception;
	void update(BoardVO boardVO) throws Exception;
	void delete(Integer boardVO) throws Exception;
	List listAll() throws Exception;
}
