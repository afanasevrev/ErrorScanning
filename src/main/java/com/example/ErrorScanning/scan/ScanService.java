package com.example.ErrorScanning.scan;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScanService {
    private final RestTemplate restTemplate = new RestTemplate();

    public ScanResult performScan(ScanRequest request) {
        String url = request.getUrl();
        ScanResult scanResult = new ScanResult();
        scanResult.setUrl(url);

        List<String> vulnerabilities = new ArrayList<>();
        // Пример тестового payload для иллюстрации проверки SQL-инъекции.
        String payload = "' OR '1'='1";
        String testUrl = url + "?param=" + URLEncoder.encode(payload, StandardCharsets.UTF_8);
        try {
            String response = restTemplate.getForObject(testUrl, String.class);
            // Условие ниже – очень упрощённая демонстрация проверки.
            if (response != null && response.contains("SQL")) {
                vulnerabilities.add("Потенциальная SQL-инъекция обнаружена");
            }
        } catch (Exception ex) {
            // Обработка исключений (например, логирование)
            vulnerabilities.add("Ошибка при проверке на SQL-инъекцию: " + ex.getMessage());
        }
        scanResult.setVulnerabilities(vulnerabilities);
        return scanResult;
    }
}
