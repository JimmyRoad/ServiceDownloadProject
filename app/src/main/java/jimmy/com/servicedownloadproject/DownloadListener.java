package jimmy.com.servicedownloadproject;

/**
 * Created by Jimmy on 17/4/3.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
