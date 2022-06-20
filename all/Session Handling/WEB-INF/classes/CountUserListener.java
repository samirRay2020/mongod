import javax.servlet.*;
import javax.servlet.http.*;

public class CountUserListener implements HttpSessionListener {
    ServletContext scx = null;
    static int count = 0;

    public void sessionCreated(HttpSessionEvent sessionEvent) {
        count++;
    }

    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        count--;
    }

    public static int getSessionCount() {
        return count;
    }

}
