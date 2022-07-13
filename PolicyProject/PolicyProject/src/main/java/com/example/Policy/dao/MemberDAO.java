package com.example.Policy.dao;
import com.example.Policy.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


public class MemberDAO {

    @Autowired
    MemberRepository memberRepository;

    public void saveMember(Member member){
        Member memberDB= memberRepository.save(member);
        System.out.println(memberDB.getId());
    }



    public Member getMember(String id)
    {
        return memberRepository.findById(id).get();
    }


}
