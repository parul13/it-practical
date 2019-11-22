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
public class chocolate extends SimpleTagSupport {
    
    private String texture;
    
    public void setTexture(String texture)
    { this.texture=texture;
    }
    
    @Override
    public void doTag() throws IOException{
    
    JspWriter out = getJspContext().getOut();
    if(texture!="")
    { if("crunchy".equalsIgnoreCase(texture))
      {
        out.println("MUNCH.KITKAT");
      }
      if("chewy".equalsIgnoreCase(texture))
      {
        out.println("BARONE.FIVESTAR");
      }
    }
    else
    {
         out.println("attribute mandatory");
    }
    }
}
