package com.example.Policy.dao;

import com.example.Policy.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Member, String> {
}
