/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author rishabh
 */
public class EmployeeBeanInfo extends SimpleBeanInfo{
    
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
         
            try {
                
                PropertyDescriptor pd1=new PropertyDescriptor("name",Employee.class);
                PropertyDescriptor pd2=new PropertyDescriptor("salary",Employee.class);
                PropertyDescriptor pd3=new PropertyDescriptor("age",Employee.class);
                
                return new PropertyDescriptor[]{pd1,pd2,pd3};
            } 
            catch (IntrospectionException ex) {
                System.out.println("Exception"+ex);
                
              
            }
        return null;
        
        }        
    }
   
    

