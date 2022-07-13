package com.example.Policy.dao;

import com.example.Policy.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface ProvisionRepository extends CrudRepository<Member, String> {
}
