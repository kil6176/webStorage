package com.webStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webStorage.dao.UploadDAO;
import com.webStorage.dto.UploadVO;
import com.webStorage.service.UploadService;

import org.springframework.web.multipart.MultipartFile; 
import javax.swing.filechooser.FileSystemView; 
import java.io.File; 

/**
 * 메인 컨트롤러
* @author kil6176
* @version 1.0, 2021.03.18
* @see None
*/

@Controller
public class HomeController {
	@Autowired
	private UploadService uploadService;
	
    /**
     * 파일 업로드 메서드 
     * @param     file : 업로드한 파일, deleteDay : 삭제 날짜, password : 파일 삭제시 필요한 비밀번호 or 파일 볼때 필요한 비밀번호
     * @exception 
     */
	@PostMapping("upload")
	public ModelAndView uploadFile(@RequestParam(value = "files", required = false) MultipartFile file, 
								   @RequestParam("deleteDay") int deleteDay, 
								   @RequestParam("password") String password) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        System.out.println("deleteDay"+ deleteDay);
	    if(uploadService.fileUpload(file, deleteDay, password) == 1)
	        modelAndView.setViewName("index");
	    else 
	    	modelAndView.setViewName("index");
	    
        return modelAndView;
	}
}