package com.manu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.manu.model.Memberdto;

@Mapper
public interface MemberMapper {
	//회원가입
		public void memberJoin(Memberdto member);
}
