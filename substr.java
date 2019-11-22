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
public class substr  extends SimpleTagSupport{
    private String input;
    private int start;
    private int end;
    public void setInput(String input)
    {
         this.input = input;
        
    }
    public void setStart(int start)
    {
         this.start = start;
        
    }
    public void setEnd(int end)
    {
         this.end = end;
        
    }
    
    
    
    public String makeSubStr()
    {
         String strg="";
         for(int i=start;i<end+1;i++)
         {
             strg+=input.charAt(i);
         }
         return strg;
    }
   @Override
   public void doTag() throws IOException{
   
       JspWriter out = getJspContext().getOut();
       out.println(makeSubStr());
   }

   
}
