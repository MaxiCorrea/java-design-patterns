package designpatterns.proxy.caching;

import java.util.Map;

public interface ThirdPartyYoutubeLib {

  public Map<String, Video> popularVideos();

  public Video getVideo(String videoId);

}
