package org.javacoursebymosh;

import org.javacoursebymosh.implementations.EmailService2023;
import org.javacoursebymosh.implementations.VideoDatabase2023;
import org.javacoursebymosh.implementations.VideoEncoder2023;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        // pass the concrete implementations as dependencies
        // instead of passing "new VideoEncoder2023()", we can
        // pass "new VideoEncoder2024()"
        var processor = new VideoProcessor(
                new VideoEncoder2023(),
                new VideoDatabase2023(),
                new EmailService2023());
        processor.process(video);
    }
}
