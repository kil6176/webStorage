package com.webStorage.dao;

import java.util.List;
import com.webStorage.dto.UploadVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class UploadDAO {
	@Autowired
	private SqlSession sqlSession;

	public UploadVO selectUploadList(){
	    return sqlSession.selectOne("sample.getTest");
	}
	
}