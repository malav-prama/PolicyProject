package com.example.Policy.logic;
import com.example.Policy.dao.PolicyDAO;
import com.example.Policy.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class PolicyLogic {

    @Autowired
    PolicyDAO policyDao;

    public void createPolicy(Policy policy)  {
        policyDao.savePolicy(policy);
    }



    public Policy getPolicy(String id)
    {
        return policyDao.getPolicy(id);
    }

}
