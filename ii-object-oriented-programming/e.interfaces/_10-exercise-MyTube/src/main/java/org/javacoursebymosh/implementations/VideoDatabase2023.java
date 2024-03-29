package org.javacoursebymosh.implementations;

import org.javacoursebymosh.Video;
import org.javacoursebymosh.interfaces.VideoDatabase;

public class VideoDatabase2023 implements VideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata in a SQL database...");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!\n");
    }
}
