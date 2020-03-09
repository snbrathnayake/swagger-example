package com.srathnayake.swagger.models;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by snbrathnayake on 2/28/2020
 **/
public class User {

    @ApiModelProperty(name = "name",notes = "name of the user")
    private String name;
    @ApiModelProperty(name = "salary",notes = "salary of the user")
    private long salary;

    public User(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


}
