package com.example.Policy.controller;

import com.example.Policy.logic.PolicyLogic;
import com.example.Policy.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")

public class PolicyController {

    @Autowired
    PolicyLogic policyLogic;
    @PostMapping()
    public void createPolicy(@RequestBody Policy policy)  {
        policyLogic.createPolicy(policy);
    }

    @GetMapping("/{id}")
    public Policy getPolicy(@PathVariable("id") String id) {
        return  policyLogic.getPolicy(id);

    }

}
