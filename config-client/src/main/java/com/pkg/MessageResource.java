package com.pkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {

	@Value("${message: Default Hello}")
	 private String message;
	 @GetMapping("/getMessage")
	 public String Message() {
		 return message;
	 }
}
