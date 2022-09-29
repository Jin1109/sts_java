package com.naver.myhome4.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.naver.myhome4.domain.Member;

public interface MemberMapper {
	
	//존재하는 아이디인지 확인 
	public Member isId(String id);
	
	//회원가입(join)
	public int insert(Member m);

	//수정 
	public int update(Member m);
	
	//삭제 
	public void delete(String id);

	//회원정보 수정 + 검색 
	public int getSearchListCount(Map<String, String> map) ;

	public List<Member> getSearchList(Map<String, Object> map) ;
	
}
