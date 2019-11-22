/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;



/**
 *
 * @author rishabh
 */
public class EmployeeIntrospect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IntrospectionException, ClassNotFoundException {
        // introspecting employee bean
        
        BeanInfo bean = Introspector.getBeanInfo(Employee.class);
        PropertyDescriptor[] propertyDescriptors=bean.getPropertyDescriptors();
        System.out.println("\nProperties");
        for(PropertyDescriptor pd:propertyDescriptors)
        {   
            System.out.println("\t"+pd.getName());
        }
      
        
    }
    
}
