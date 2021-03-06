package com.zh.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadManyAction extends ActionSupport{

	/*
	 *上传多个文件使用数组或者list接收 
	 */
	private File upload[];	//上传的文件
	private String uploadContentType[];	//上传文件的mimeType类型
	private String uploadFileName[];	//上传文件的名称
	
	public void uploadFile() {
		//得到upload目录在tomcat的绝对磁盘路径
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		try {
			for (int i = 0; i < upload.length; i++) {
				//创建一个服务器端文件
				File dest = new File(path,uploadFileName[i]);
				//完成文件上传操作
				FileUtils.copyFile(upload[i], dest);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	
	
}
