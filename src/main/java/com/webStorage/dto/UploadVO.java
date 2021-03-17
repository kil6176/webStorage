package com.webStorage.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UploadVO {
	private int file_num;
    private String file_original_name;
    private String file_uuid_name;
    private String file_upload_date;
    private String file_delete_date;
    private String file_password;
    private String file_location;
}