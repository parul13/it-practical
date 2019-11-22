/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom;

import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author kiran
 */
public class today extends SimpleTagSupport{
    @Override
    public void doTag() throws IOException
    {
        Date d=new Date();
        JspWriter out=getJspContext().getOut();
        out.println(d);
    }
}
