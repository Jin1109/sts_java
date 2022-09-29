package com.naver.myhome4.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.myhome4.aop.LogAdvice;
import com.naver.myhome4.domain.Comment;
import com.naver.myhome4.mybatis.mapper.CommentsMapper;
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentsMapper dao;
	
	@Autowired
	private LogAdvice log;
	
	@Autowired
	public CommentServiceImpl(CommentsMapper dao) {
		this.dao = dao;
	}

	@Override
	public int getListCount(int board_num) {
		log.beforeLog();
		return dao.getListCount(board_num);
	}

	@Override
	public List<Comment> getCommentList(int board_num, int page) {
		log.beforeLog();
		int startrow = 1;
		int endrow = page * 3;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("board_num", board_num);
		map.put("start", startrow);
		map.put("end", endrow);
		return dao.getCommentList(map);
	}

	@Override
	public int commentsInsert(Comment c) {
		return dao.commentsInsert(c);
	}

	@Override
	public int commentsDelete(int num) {
		return dao.commentsDelete(num);
	}

	@Override
	public int commentsUpdate(Comment co) {
		return dao.commentsUpdate(co);
	}
}