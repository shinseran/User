package com.manu.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.manu.model.Memberdto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {

	@Autowired
	private MemberMapper membermapper;			//MemberMapper.java 인터페이스 의존성 주입
	
	//회원가입 쿼리 테스트 메서드
	@Test
	public void memberJoin() throws Exception{
		Memberdto member = new Memberdto();
		
		member.setId("test");			//회원 id
		member.setMemberName("test");			//회원 이름
		member.setMemberPassword("test");		//회원 비밀번호
		
		
		membermapper.memberJoin(member);			//쿼리 메서드 실행
		
	}
	
	
	
}