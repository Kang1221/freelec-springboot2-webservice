package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //extends JpaRepository<Posts, Long> = 자동으로 CRUD 메소드 생성
    //단, 엔티티와 엔티티 레포지토리를 함께 위치시킬 것!
    //레포지토리 없이 엔티티클래스는 제대로 역할을 할 수 X
}
