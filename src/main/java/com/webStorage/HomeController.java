package com.webStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webStorage.dao.UploadDAO;
import com.webStorage.dto.UploadVO;


@Controller
public class HomeController {
	@Autowired
	private UploadDAO uploadDAO;
	
	@GetMapping("upload")
	public ModelAndView home() {
	    UploadVO uploadVO = uploadDAO.selectUploadList();
	    int num = uploadVO.getFile_num();
	    System.out.println(num);
	    System.out.println(uploadVO);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
	}
}