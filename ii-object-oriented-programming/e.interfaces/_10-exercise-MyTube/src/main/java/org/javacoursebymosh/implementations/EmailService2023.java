package org.javacoursebymosh.implementations;

import org.javacoursebymosh.User;
import org.javacoursebymosh.interfaces.EmailService;

public class EmailService2023 implements EmailService {
    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
