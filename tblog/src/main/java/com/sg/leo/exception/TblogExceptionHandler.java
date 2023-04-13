package com.sg.leo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController 
public class TblogExceptionHandler {

	 @ExceptionHandler(value=Exception.class)
     public String globalExceptionHandler(Exception e) {
   	  return "<h1> 아이쿠, 예외발생, Tblogexception</h1>"
   			  + "<h2>e.getMessage</h2>";
     }
}
