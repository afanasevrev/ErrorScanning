package com.example.ErrorScanning.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScanScheduler {
    @Autowired
    private ScanService scanService;

    // Пример: запуск сканирования каждые 60 секунд.
    @Scheduled(fixedDelay = 60000)
    public void scheduledScan() {
        ScanRequest request = new ScanRequest();
        request.setUrl("http://example.com"); // Можно брать URL из настроек или базы данных
        ScanResult result = scanService.performScan(request);
        // Сохраняйте результат в БД или обрабатывайте иным образом (например, логирование)
        System.out.println("Сканирование для " + result.getUrl());
        System.out.println("Обнаруженные уязвимости: " + result.getVulnerabilities());
    }
}
