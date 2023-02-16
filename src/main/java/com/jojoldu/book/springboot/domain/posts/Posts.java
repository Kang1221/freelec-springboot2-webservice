package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//주요 어노테이션을 클래스에 가깝게!
@Getter //모든 필드의 Getter 메소드 자동생성
@NoArgsConstructor //기본 생ㄹ성자 자동 추가
@Entity //테이블이랑 매칠될 클래스
public class Posts { //실제 DB 테이블과 매칭될 테이블 (Entity 클래스)
    // **Entity 클래스에서는 절대 Setter 메소드 만들지 않음**
    @Id //PK염!!
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성규칙!!
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "Text", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
