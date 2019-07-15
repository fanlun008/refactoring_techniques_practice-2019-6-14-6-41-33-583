package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        boolean isBrowserInplatform = (platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"));
        if (isBrowserInplatform) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
