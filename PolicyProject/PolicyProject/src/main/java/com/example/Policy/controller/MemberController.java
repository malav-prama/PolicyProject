package com.example.Policy.controller;
import com.example.Policy.model.Member;
import com.example.Policy.logic.MemberLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")


public class MemberController {

    @Autowired
    MemberLogic memberLogic;
    @PostMapping()
    public void createMember(@RequestBody Member member)  {
        memberLogic.createMember(member);
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable("id") String id) {
        return  memberLogic.getMember(id);

    }

}
