package hello.hellospring2.repository;

import hello.hellospring2.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findByID(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
