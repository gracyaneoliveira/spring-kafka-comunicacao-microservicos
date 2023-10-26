package com.casadocodigo.shop.controller;

import com.casadocodigo.shop.dto.ShopReportDTO;
import com.casadocodigo.shop.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/shop_report")
@RequiredArgsConstructor
public class ShopController {
    private final ReportRepository reportRepository;

    @GetMapping
    public List<ShopReportDTO> getShopReport() {
        return reportRepository.findAll()
                .stream()
                .map(ShopReportDTO::convert)
                .collect(Collectors.toList());
    }
}