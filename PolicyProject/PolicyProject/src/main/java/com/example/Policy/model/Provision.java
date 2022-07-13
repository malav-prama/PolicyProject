package com.example.Policy.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "provision")
public class Provision {

  private String glass;
  private String engine;
  private String body;

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
