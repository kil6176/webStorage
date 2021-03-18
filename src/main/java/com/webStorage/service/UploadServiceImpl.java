package com.webStorage.service;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.swing.filechooser.FileSystemView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.webStorage.dao.UploadDAO;
import com.webStorage.dto.UploadVO;

/**
* @author kil6176
* @version 1.0, 파일생성
* @see None
*/

@Service
public class UploadServiceImpl implements UploadService
{

	@Autowired
	private UploadDAO dao;
	private UploadVO vo;

	@Override
	public UploadVO getUploadList() throws Exception
	{
		return dao.getUploadList();
	}
	
	@Override
	//파일 업로드
	public int fileUpload(MultipartFile file, int deleteDay, String password) throws Exception {
		
	    String uuidFileName = UUID.randomUUID().toString()+file.getOriginalFilename();
	    
	    vo.setFile_original_name(file.getOriginalFilename());
	    vo.setPassword(password);
	    vo.setDeleteDay(deleteDay);
	    vo.setFile_uuid_name(uuidFileName);
	    
		String rootPath = FileSystemView.getFileSystemView().getHomeDirectory().toString();
	    String basePath = rootPath + "/" + "files";
	    String filePath = basePath + "/" + uuidFileName;
	    
	    File dest = new File(filePath);
	    
	    file.transferTo(dest); // 파일 업로드 작업 수행
	    
		return dao.fileUpload(vo);
	}
}
