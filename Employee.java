/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author rishabh
 */
public class Employee implements Serializable{
    private String name;
    private int age;
    private int salary;
    private String address;
    private String job;
    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    
     public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public String getjob(){
        return job;
    }
    public void setjob(String job){
        this.job=job;
    }

    
}