package hello.core.Member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test //테스트를 위해서는 어노테이션을 넣어줘야함.
    void join(){
        //given 주어진환경
        Member member = new Member(1l, "memberA", Grade.VIP);

        //when 언제
        memberService.join(member);
        Member findMember = memberService.findByMember(1L);

        //then 동작한다
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
