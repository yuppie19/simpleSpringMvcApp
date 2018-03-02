package listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Created by rustem on 02.03.18.
 */
public class ContextAttributeListener implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("NAME ADDED: " + servletContextAttributeEvent.getName());
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("NAME REMOVED: " + servletContextAttributeEvent.getName());
    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("NAME REPLACED: " + servletContextAttributeEvent.getName());
    }
}
