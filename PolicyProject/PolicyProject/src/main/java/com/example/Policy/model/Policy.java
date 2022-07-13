package com.example.Policy.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "policy")

public class Policy {

   private String effectiveDate;
   private String endDate;

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
