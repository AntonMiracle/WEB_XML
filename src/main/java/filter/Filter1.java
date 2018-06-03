package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

@WebFilter(value = Filter1.URL, initParams = {
        @WebInitParam(name = "param1", value = "valueparam1"),
        @WebInitParam(name = "param2", value = "valueparam2"),
        @WebInitParam(name = "param3", value = "valueparam3")},
        dispatcherTypes = {
                DispatcherType.ERROR,
                DispatcherType.FORWARD,
                DispatcherType.REQUEST})
public class Filter1 implements Filter {
    public final static String URL = "/filterController1";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        out.println(this.getClass().toString() + " INIT method" + lineSeparator());
        System.out.println("FILTER INIT PARAM : " + filterConfig.getInitParameter("filterParam"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.getWriter().write("START method doFilter" + lineSeparator());
        PrintWriter writer = response.getWriter();
        System.out.println(request.getRemoteHost());
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
