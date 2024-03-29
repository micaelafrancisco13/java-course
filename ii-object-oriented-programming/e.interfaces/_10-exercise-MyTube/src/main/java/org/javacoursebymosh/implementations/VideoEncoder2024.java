package org.javacoursebymosh.implementations;

import org.javacoursebymosh.Video;
import org.javacoursebymosh.interfaces.VideoEncoder;

public class VideoEncoder2024 implements VideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video using the 2024 version...");
        System.out.println("Done!\n");
    }
}
