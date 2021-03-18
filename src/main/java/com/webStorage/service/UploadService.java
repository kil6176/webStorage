package com.webStorage.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.webStorage.dto.UploadVO;


/**
* 
* @author kil6176
* @version 1.0, 2021.03.18
* @see None
*/


public interface UploadService {
	//
    public UploadVO getUploadList() throws Exception;

	//파일 업로드
	public int fileUpload(MultipartFile file, int deleteDay, String password) throws Exception;
}
