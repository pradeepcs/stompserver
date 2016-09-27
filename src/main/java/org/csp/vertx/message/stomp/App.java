package org.csp.vertx.message.stomp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.stomp.StompServer;
import io.vertx.ext.stomp.StompServerHandler;

/**
 * Hello world!
 *
 */
public class App extends AbstractVerticle {
	
	public void start() {
		StompServer server = StompServer.create(vertx)
			    .handler(StompServerHandler.create(vertx))
			    .listen();
	}
	
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Vertx.vertx().deployVerticle("java:org.csp.vertx.message.stomp.App");
    }
}
