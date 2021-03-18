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


public interface UploadDAO {

	//업로드 리스트 불러오기
	public UploadVO getUploadList() throws Exception;

	//파일 업로드
	public int fileUpload(UploadVO vo) throws Exception;
    
}
 