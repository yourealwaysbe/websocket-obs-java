package net.twasi.obsremotejava.requests.TakeSourceScreenshot;

import net.twasi.obsremotejava.requests.ResponseBase;

import java.util.Map;

public class TakeSourceScreenshotResponse extends ResponseBase {
    private String sourceName;
    private String img;
    private String imageFile; // not currently used

    public String getSourceName() {
        return sourceName;
    }

    public String getImg() {
        return img;
    }
}
