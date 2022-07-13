package com.example.Policy.dao;
import com.example.Policy.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


public class PolicyDAO {

    @Autowired
    PolicyRepository policyRepository;

//    public void savePolicy(Policy policy){
//        Policy policyDB= policyRepository.save(policy);
//        System.out.println(policyDB.getId());
//    }
//
//
//
//    public Policy getPolicy(String id)
//    {
//        return policyRepository.findById(id).get();
//    }


}
