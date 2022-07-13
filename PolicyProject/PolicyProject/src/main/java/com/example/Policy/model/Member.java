package com.example.Policy.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "member")

public class Member
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;
    public String name;
    public String dependentOne;
    public String dependentTwo;
    public String age;
    public String DOB;
    public String state;
    public String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDependentOne() {
        return dependentOne;
    }

    public void setDependentOne(String dependentOne) {
        this.dependentOne = dependentOne;
    }

    public String getDependentTwo() {
        return dependentTwo;
    }

    public void setDependentTwo(String dependentTwo) {
        this.dependentTwo = dependentTwo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}