package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.*;

public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        out.println(this.getClass().toString() + " INIT method" + lineSeparator());
        System.out.println("FILTER INIT PARAM : " + filterConfig.getInitParameter("filterParam"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.getWriter().write("START method doFilter" + lineSeparator());
        PrintWriter writer = response.getWriter();
        writer.write(this.getClass().toString() + " FILTER start" + lineSeparator());

        // до этого вызова можно спокойно работать с реквестом и респонсом
        chain.doFilter(request, response); // Если этой строки не будет, то после вызова фильтра дальше никакой сервлет не вызовиться
//        chain.doFilter(request, new MyResponseWrapper((HttpServletResponse)response)); // Использование врапперов

        response.getWriter().write("END method doFilter" + lineSeparator());
    }

    @Override
    public void destroy() {
        out.println(this.getClass().toString() + " DESTROY method");
    }
}
// Обертка респонс
class MyResponseWrapper extends HttpServletResponseWrapper {
    public MyResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        System.out.println("CALL .getWriter");
        return super.getWriter();
    }
}
