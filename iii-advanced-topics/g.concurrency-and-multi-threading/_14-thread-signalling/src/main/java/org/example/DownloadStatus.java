package org.example;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private volatile boolean isDownloadFileFinished;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        ++totalBytes;
    }

    public void incrementTotalFiles() {
        ++totalFiles;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDownloadFileFinished() {
        return isDownloadFileFinished;
    }


    public void setDownloadFileFinished() {
        isDownloadFileFinished = true;
    }
}
