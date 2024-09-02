package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class MyNews {
	ScannerUtils scannerutils = new ScannerUtils();
	public void inSertNews() {
		News news = new News ();
		int id = scannerutils.inputId("nhập vào id");
		news.setId(id);
		String title = scannerutils.inputName("nhập vào title");
		news.setTitle(title);
		String publicdate = scannerutils.inputName("nhập vào publishDate");
		news.setPublishDate(publicdate);
		String author = scannerutils.inputName("nhập vào  author");
		news.setAuthor(author);
		
		
	}
}
