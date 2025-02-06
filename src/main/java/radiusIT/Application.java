package radiusIT;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import radiusIT.camel.DatabaseComponent;
import radiusIT.camel.CustomRouteBuilder;
import radiusIT.util.DatabaseInitializer;

public class Application {
    public static void main(String[] args) throws Exception {
        DatabaseInitializer initializer = new DatabaseInitializer();
        initializer.initializeDatabase();

        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addComponent("database", new DatabaseComponent());
        camelContext.addRoutes(new CustomRouteBuilder());

        camelContext.start();
        Thread.sleep(20000);
        camelContext.stop();
    }

}
