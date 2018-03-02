package listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by rustem on 02.03.18.
 */
public class RequestListener implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("NEW REQUEST DESTROYED");
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("NEW REQUEST INIT");
    }
}
