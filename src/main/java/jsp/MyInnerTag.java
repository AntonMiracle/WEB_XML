package jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyInnerTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
//getParent() - return first upper teg, need to search in parents tags needed parent tag
        //Another way find teg by class
        JspTag ancestorWithClass = findAncestorWithClass(this, MyJspTag.class);
        MyJspTag parentTeg = (MyJspTag) ancestorWithClass;
        getJspContext().getOut().print("Inside " + this.getClass().toString()
                + ". Try to get param value " + parentTeg.getClass().toString()
                + ". Value of param : " + parentTeg.getParamNameJspTag());

    }
}
