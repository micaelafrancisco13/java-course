package org.example;

public class ExecutorsDemo {
    public static void show() {
        // How to create an asynchronous API?
        var service = new MailService();

        /*
         * This send() is a synchronous or blocking operation. So if you print another message (line 13), we're not going to see it until
         * this method returns.
         * */
        // service.send();
        System.out.println("Hello world!");

        /*
         * Anytime we have a long-running operation, like querying a database, calling a remote service, working with the file system, we
         * should run these operations asynchronously.
         *
         * Go back to MailService class.
         * */

        // A non-blocking operation, hence, line 13 is going to be printed immediately.
        service.sendAsync();

        // The "Mail was sent..." was not printed to the console? Why? Here, we have a command line program, and this program terminated
        // so quickly that we didn't see the result of this task that was executed on a separate thread. We don't have this problem in a
        // mobile or a desktop app because these apps are continuously running until the user terminates them. So to prove to you that our
        // mail was being sent on a separate thread, let's put a delay over here.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
