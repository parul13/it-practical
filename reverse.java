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
public class reverse extends SimpleTagSupport {
   private String str;
   
    public void setStr(String str)
    { 
        this.str=str;
        
    }
    public String rev()
    {     String revstr=" ";
         for(int i=str.length()-1;i>=0;i--)
         { 
             revstr+=str.charAt(i);
         }
         return revstr;
             }
    
   @Override
   public void doTag() throws IOException{
    JspWriter out = getJspContext().getOut();
    out.println(rev());
  
   } 
}
