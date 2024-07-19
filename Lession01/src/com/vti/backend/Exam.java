package com.vti.backend;

import java.time.LocalDateTime;

public class Exam {
	int id;
	char code;
	String title;
	CategoryQuestion category;
	int duration;
	Account creator;
	LocalDateTime createDate;
}
