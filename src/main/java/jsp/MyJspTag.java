package jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

// need to add lib jsp.api
// work with tld.MyTagDescriptor
public class MyJspTag extends SimpleTagSupport {
    private String paramNameJspTag; // название переменной как и в MyTag.jsp название параметра
    // нужно определить атрибут в MyTagDescriptor.tld

    @Override
    public void doTag() throws JspException, IOException {
        System.out.println(this.getClass().toString() + " doTag method");
        getJspContext().getOut().print("msg from :" + this.getClass().toString() + " doTag method<br>");
        getJspContext().getOut().print("parameter which value setting in MyTag.jsp : " + paramNameJspTag);
        //Создаем атрибут в таге и даем ему значение
        getJspContext().setAttribute("TagAttName", "tagAttValue");
        //вывести содержимое тела тага
        //variant 1
//        getJspContext().getOut().print("<b>");
//        getJspBody().invoke(null); // Если хотим отобразить тело тега в MyTag.jsp
//        getJspContext().getOut().print("<b>");
        // variant 2
        //в жтом случает в writer будет храниться тело тага, которые сможем вытащить и обработать
        StringWriter writer = new StringWriter();
        getJspBody().invoke(writer); // записываем в writer тело тега в MyTag.jsp
        String afterEdit = writer.toString().toUpperCase(); //обрабатываем тело тега
        getJspContext().getOut().print("<b>");
        getJspContext().getOut().print(afterEdit);
        getJspContext().getOut().print("<b>");

    }

    public static int functionMinus(int num1, int num2) {
        return num1 - num2;
    }

    public void setParamNameJspTag(String paramNameJspTag) {
        this.paramNameJspTag = paramNameJspTag;
    }
}
