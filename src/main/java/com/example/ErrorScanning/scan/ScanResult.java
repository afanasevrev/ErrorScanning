package com.example.ErrorScanning.scan;

import java.util.List;
/**
 * Класс результата
 */
public class ScanResult {
    private String url;
    private List<String> vulnerabilities;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public List<String> getVulnerabilities() {
        return vulnerabilities;
    }
    public void setVulnerabilities(List<String> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
}
