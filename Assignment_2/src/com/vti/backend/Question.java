package com.vti.backend;

import java.time.LocalDateTime;

public class Question {
   int id;
   String content;
   CategoryQuestion category;
   TypeQuestion type;
   Account creator;
   LocalDateTime createDate;
}
