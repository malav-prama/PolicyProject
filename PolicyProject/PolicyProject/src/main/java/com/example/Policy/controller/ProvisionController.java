package com.example.Policy.controller;

import com.example.Policy.logic.ProvisionLogic;
import com.example.Policy.model.Provision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("")
public class ProvisionController {

    @Autowired
    ProvisionLogic provisionLogic;
    @PostMapping()
    public void createProvision(@RequestBody Provision provision)  {
        provisionLogic.createProvision(provision);
    }

    @GetMapping("/{id}")
    public Provision getProvision(@PathVariable("id") String id) {
        return  provisionLogic.getProvision(id);

    }
}
