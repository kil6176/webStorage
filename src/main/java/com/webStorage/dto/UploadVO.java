package com.webStorage.dto;

import lombok.Data;

@Data
public class UploadVO {
	//DB
	private int file_num;
    private String file_original_name;
    private String file_uuid_name;
    private String file_upload_date;
    private String file_delete_date;
    private String file_password;
    private String file_location;
    
    //DB외
    private int deleteDay;
    private String password;
}