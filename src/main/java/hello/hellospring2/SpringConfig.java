package hello.hellospring2;

import hello.hellospring2.repository.MemberRepository;
import hello.hellospring2.repository.MemoryMemberRepository;
import hello.hellospring2.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
