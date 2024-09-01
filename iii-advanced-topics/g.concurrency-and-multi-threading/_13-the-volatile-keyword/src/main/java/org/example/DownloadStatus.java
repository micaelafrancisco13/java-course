package org.example;

public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    /*
    * With this flag, we can tell if you have downloaded all the bytes or not.
    * Volatile means unstable. So we're telling the JVM, "Hey, this field is unstable. It may change. So don't rely on the value
    * stored in the cache. Always read it from the main memory." And that means, if another thread updates the value of this field,
    * the change will be immediately written to the main memory.
    * 
    * */
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
