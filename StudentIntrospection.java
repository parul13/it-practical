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
public class StudentIntrospection {
    
public static void main(String[] args) throws ClassNotFoundException, IntrospectionException  {
        BeanInfo bInfo= Introspector.getBeanInfo(StudentBean.class);
        //BeanInfo bInfo=Introspector.getBeanInfo(Class.forName("beans.StudentBean"));
        PropertyDescriptor pdArray[]=bInfo.getPropertyDescriptors();
        System.out.println("Properties: ");
        for(PropertyDescriptor pd : pdArray)
            System.out.println("\t"+pd.getName()); 
}}