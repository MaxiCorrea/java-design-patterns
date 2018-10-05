package designpatterns.proxy.cache;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

  @Override
  public Map<String, Video> popularVideos() {
    Map<String, Video> hmap = new HashMap<String, Video>();
    hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
    hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
    hmap.put("dancescideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
    hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
    hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
    return hmap;
  }

  @Override
  public Video getVideo(String videoId) {
    Video video = new Video(videoId, "Some video title");
    return video;
  }

}
