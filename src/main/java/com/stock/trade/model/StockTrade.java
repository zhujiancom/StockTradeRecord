package com.stock.trade.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="STOCK_TRADE_RECORD")
@Data
public class StockTrade {
    private String stockCode;

    private String stockName;

    private TradeType tradeType;

    private Date tradeDate;

    private BigDecimal turnover;

    private BigDecimal tradePrice;

    private BigDecimal turnoverSum;

    private BigDecimal currentCost;

    private BigDecimal residue;
}
