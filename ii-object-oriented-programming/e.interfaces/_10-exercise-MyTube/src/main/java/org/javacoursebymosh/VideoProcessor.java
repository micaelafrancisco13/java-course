package org.javacoursebymosh;

import org.javacoursebymosh.interfaces.EmailService;
import org.javacoursebymosh.interfaces.VideoDatabase;
import org.javacoursebymosh.interfaces.VideoEncoder;

public class VideoProcessor {
    private final VideoEncoder encoder;
    private final VideoDatabase database;
    private final EmailService emailService;

    public VideoProcessor(VideoEncoder encoder,
                          VideoDatabase database,
                          EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        // instead of working with the concrete implementations
        // (objects), we program against interfaces
        // var encoder = new VideoEncoder();
        // var database = new VideoDatabase();
        // var emailService = new EmailService();

        // one more benefit of decoupling is "unit testing"
        // we can test this class in isolation, without being
        // dependent to a real database or a real email service
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

