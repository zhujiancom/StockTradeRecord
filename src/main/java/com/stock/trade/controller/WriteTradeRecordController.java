package com.stock.trade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WriteTradeRecordController {
    @RequestMapping("/write")
    String write(){
        return "write";
    }
}
