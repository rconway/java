/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javarest;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
    }

    // This is just to show a simple unit test
    public String getGreeting() {
        return "Hello, world!";
    }
}

