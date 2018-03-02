package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by rustem on 02.03.18.
 */
public class ContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("CONTEXT CREATED");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("CONTEXT DESTROYED");
    }
}
