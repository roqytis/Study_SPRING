package com.service;

import org.springframework.stereotype.Component;

@Component //<context:component-scan 자동 빈생성 id=소문자시작
public class DeptService {
   public String getService() {
	   return "DeptService.getSErvice 호출됨";
	   
   }
}
