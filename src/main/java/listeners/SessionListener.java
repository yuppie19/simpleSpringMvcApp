package listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by rustem on 02.03.18.
 */
public class SessionListener implements HttpSessionListener{

    private static int counter = 0;

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("SESSION CREATED " + httpSessionEvent.getSession().getAttribute("user"));
        counter++;
        System.out.println(counter);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("SESSION DESTROYED " + httpSessionEvent.getSession().getAttribute("user"));
    }
}
