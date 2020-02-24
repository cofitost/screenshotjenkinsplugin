package io.jenkins.plugins.screenshot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hudson.FilePath;

public class TestScreenshot {
  @Test
  public void test() {
    ScreenShotBuilder screenShotBuilder = new ScreenShotBuilder("http://140.134.26.76:38808/wd/hub");
    // E:\\project\\WebStart\\src\\web\\html\\index.html
    String workspace = "E:\\project\\ProgEdu\\screenshotjenkinsplugin\\WebStart";
    List<String> file = new ArrayList<>();
    file.add("E:\\project\\ProgEdu\\screenshotjenkinsplugin\\WebStart\\src\\web\\html\\index.html");
    file.add("E:\\project\\ProgEdu\\screenshotjenkinsplugin\\WebStart\\src\\web\\html\\sec.html");
    file.add("E:\\project\\ProgEdu\\screenshotjenkinsplugin\\WebStart\\src\\web\\html\\table.html");
    try {
      screenShotBuilder.screenshotMethod(workspace, file);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}