package designpatterns.proxy.caching;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {

  private ThirdPartyYoutubeLib youtubeService;
  private Map<String, Video> cachePopular;
  private Map<String, Video> cacheAll;

  public YoutubeCacheProxy() {
    youtubeService = new ThirdPartyYoutubeClass();
    cachePopular = new HashMap<>();
    cacheAll = new HashMap<>();
  }

  @Override
  public Map<String, Video> popularVideos() {
    if (cachePopular.isEmpty()) {
      cachePopular = youtubeService.popularVideos();
    }
    return cachePopular;
  }

  @Override
  public Video getVideo(String videoId) {
    Video video = cacheAll.get(videoId);
    if (video == null) {
      video = youtubeService.getVideo(videoId);
      cacheAll.put(videoId, video);
    }
    return video;
  }

  public void reset() {
    cachePopular.clear();
    cacheAll.clear();
  }

}
