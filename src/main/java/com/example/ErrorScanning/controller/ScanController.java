package com.example.ErrorScanning.controller;

import com.example.ErrorScanning.scan.ScanRequest;
import com.example.ErrorScanning.scan.ScanResult;
import com.example.ErrorScanning.scan.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ScanController {
    @Autowired
    private ScanService scanService;

    @PostMapping("/scan")
    public ResponseEntity<ScanResult> startScan(@RequestBody ScanRequest request) {
        ScanResult result = scanService.performScan(request);
        return ResponseEntity.ok(result);
    }
}
