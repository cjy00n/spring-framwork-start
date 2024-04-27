package com.example.demo;

import com.example.demo.chap03.used.Greet;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;

@SpringBootApplication
public class DemoApplication {
    /**
     * 메인 메서드
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args).getBean(DemoApplication.class).execute();
    }

    /**
     * 주입하는 곳 (인터페이스)
     */
    @Autowired
    MemberCrudRepository repository;

    /**
     * 등록과 전체 취득 처리
     */

    private void execute() {
        // 등록
		executeInsert();
		// 전체 취득
		executeSelect();
    }

    /**
     * 등록
     */
    public void executeInsert() {
        // 엔티티 생성(id는 자동 부여되기 때문에 null을 설정)
        Member member = new Member(null, "최정윤");
        // 리포지토리를 이용해 등록을 수행하고 결과를 취득
        member = repository.save(member);
        // 결과를 표시
        System.out.println("등록 데이터 " + member);
    }

	/**
	 * 전체 취득
	 */
	public void executeSelect(){
		System.out.println("전체 데이터를 취득합니다.");
		// 리포지토리를 이용해 전체 데이터 취득
		Iterable<Member> members = repository.findAll();
		for(Member member : members){
			System.out.println(member);
		}
	}

}
