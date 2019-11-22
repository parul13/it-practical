/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author kiran
 */
public class hello extends SimpleTagSupport{
    
    private String name;
    public void setname(String name)
    {
         this.name=name;
    }

    /**
     *
     * @throws IOException
     */
   @Override
    public void doTag() throws IOException
    { 
    JspWriter out = getJspContext().getOut();
    
    out.println("Hello "+name);
    }
    
}
