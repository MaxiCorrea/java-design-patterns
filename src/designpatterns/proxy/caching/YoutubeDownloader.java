package designpatterns.proxy.caching;

import java.util.Map;

public class YoutubeDownloader {

  private ThirdPartyYoutubeLib api;

  public YoutubeDownloader(ThirdPartyYoutubeLib api) {
    this.api = api;
  }

  public void renderVideoPage(String videoId) {
    Video video = api.getVideo(videoId);
    video.getId();
    video.getTitle();
    video.getData();
  }

  public void renderPopularVideos() {
    Map<String, Video> list = api.popularVideos();
    for (Video video : list.values()) {
      video.getId();
      video.getTitle();
    }
  }

}
