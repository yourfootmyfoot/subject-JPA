package com.example.subjectjpa.match;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MatchRepository {

    // EntityManager : 영속성 관리한다
    // EntityManager 를 빈으로 주입할 때 사용하는 어노테이션
    @PersistenceContext
    private EntityManager manager;

    // Match 타입의 정보(경기에 대한 정보)를 영속성 컨텍스트에 추가하여 데이터 베이스에 저장하는 메서드
    public void save(Match match) {
        // EntityManager 클래스의 persist 메서드 : 엔티티를 영속성 컨텍스트에 추가하여 데이터베이스에 저장한다.
        manager.persist(match);
    }
}
