package filters;

import javax.servlet.*;
import java.io.IOException;

public class PreProcessingFilter implements Filter {
    long countOfRequests = 0L;

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FILTER BEFORE SERVLET");
        countOfRequests++;
        System.out.println("COUNT OF REQUESTS " + countOfRequests);
    }

    public void destroy() {
        System.out.println("COUNT OF REQUESTS " + countOfRequests);
    }
}
