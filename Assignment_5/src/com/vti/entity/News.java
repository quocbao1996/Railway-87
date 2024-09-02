package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class News implements INews {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int [] rates;
	
	public News(int id, String title, String publishDate, String author, String content) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
	}
	public News() {
		
	}
	@Override
	public void Display() {
		System.out.println(this.title + this.publishDate
				+ this.author + this.content + this.averageRate);
		
	}
	@Override
	public float Calculate() {
		if (rates.length == 0 ) {
			averageRate = 0;
		}else {
			int sum = 0;
			for (int rate : rates) {
				sum+= rate;
			} averageRate = (float)sum/rates.length;
		}
		return averageRate;
	}
}
