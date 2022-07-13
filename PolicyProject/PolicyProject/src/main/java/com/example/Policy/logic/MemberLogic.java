package com.example.Policy.logic;
import com.example.Policy.dao.MemberDAO;
import com.example.Policy.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class MemberLogic {

    @Autowired
    MemberDAO memberDao;

    public void createMember(Member member)  {
        memberDao.saveMember(member);
    }



    public Member getMember(String id)
    {
        return memberDao.getMember(id);
    }

}
