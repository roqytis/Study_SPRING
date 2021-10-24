package com.Service;

import org.springframework.stereotype.Service;

@Service("xxx") //빈생성
public class OneService {
    public void one() {
    	System.out.println("oneservice");
    }
}
