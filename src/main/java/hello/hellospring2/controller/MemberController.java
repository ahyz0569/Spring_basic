package hello.hellospring2.controller;

import hello.hellospring2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // DI (의존성 주입)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
