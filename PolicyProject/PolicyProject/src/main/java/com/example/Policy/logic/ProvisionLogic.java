package com.example.Policy.logic;
import com.example.Policy.dao.ProvisionDAO;
import com.example.Policy.model.Provision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ProvisionLogic {

    @Autowired
    ProvisionDAO provisionDao;

    public void createProvision(Provision provision)  {
        provisionDao.saveProvision(provision);
    }



    public Provision getProvision(String id)
    {
        return provisionDao.getProvision(id);
    }

}
