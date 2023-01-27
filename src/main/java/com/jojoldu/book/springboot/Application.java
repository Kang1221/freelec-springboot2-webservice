package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //요게 있는 위치부터 설정을 읽어감 = 항상 프로젝트의 최상단에 위치
// 스프링부트의 자동 설정, 스프링 Bean 읽, 생성을 모두 자동으로 설정됨
public class Application { // 메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // SpringApplication.run = 내장 WAS 실행 -> 톰캣 설치할 필요 X
    }
}
