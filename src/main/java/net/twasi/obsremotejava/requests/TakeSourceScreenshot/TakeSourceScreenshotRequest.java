package net.twasi.obsremotejava.requests.TakeSourceScreenshot;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.BaseRequest;
import net.twasi.obsremotejava.requests.RequestType;

public class TakeSourceScreenshotRequest extends BaseRequest {
    // hard code this to avoid exceeding response length limit
    private int width = 300;

    private String sourceName;
    private String embedPictureFormat;

    public TakeSourceScreenshotRequest(OBSCommunicator com,
                                       String sourceName,
                                       String embedPictureFormat) {
        super(RequestType.TakeSourceScreenshot);

        this.sourceName = sourceName;
        this.embedPictureFormat = embedPictureFormat;

        com.messageTypes.put(getMessageId(), TakeSourceScreenshotResponse.class);
    }
}
