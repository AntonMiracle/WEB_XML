package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

//    Listener`s list

//    ServletContextListener
//    ServletContextAttributeListener
//    HttpSessionListener
//    HttpSessionAttributeListener
//    HttpSessionBindingListener
//    HttpSessionActivationListener
//    ServletRequestListener
//    ServletRequestAttributeListener

public class Listener1 implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println(this.getClass().toString() + " attributeAdded method");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println(this.getClass().toString() + " attributeRemoved method");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println(this.getClass().toString() + " attributeReplaced method");
    }
}

