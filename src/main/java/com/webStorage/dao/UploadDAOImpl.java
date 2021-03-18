package com.webStorage.dao;

import java.util.List;
import com.webStorage.dto.UploadVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

/**
* @author kil6176
* @version 1.0, 파일생성
* @see None
*/

@Repository
public class UploadDAOImpl implements UploadDAO
{

	@Autowired
	private SqlSession sqlSession;

	private static final String Namespace = "upload";
	
	//업로드 리스트 가져오기
	@Override
	public UploadVO getUploadList() throws Exception
	{
		return sqlSession.selectOne(Namespace + ".getTest");
	}	
	
	@Override
	//업로드 리스트 가져오기
	public int fileUpload(UploadVO vo) throws Exception
	{
		return sqlSession.insert(Namespace + ".upload", vo);
	}	

}
 