package io.jenkins.plugins.screenshot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestScreenshot {
  @Test
  public void testSearch() {
    ScreenShotBuilder screenShotBuilder = new ScreenShotBuilder("http://140.134.26.76:38101/wd/hub");
    String filePath = ".\\WebStart";
    System.out.print(screenShotBuilder.searchAllHtmlFile(filePath));
  }

  @Test
  public void testScreenMethod() {
    ScreenShotBuilder screenShotBuilder = new ScreenShotBuilder("http://140.134.26.76:38101/wd/hub");
    // E:\\project\\WebStart\\src\\web\\html\\index.html
    String workspace = ".\\WebStart";
    List<String> file = new ArrayList<>();
    file.add("http://140.134.26.76:28888/index.html");
    file.add("http://140.134.26.76:28888/sec.html");
    file.add("http://140.134.26.76:28888/table.html");
    try {
      screenShotBuilder.screenshotMethod(workspace, file);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}