package com.guide.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by lq on 2017/12/1.
 */
@Data
public class GoodsInfo {

    /**
     * 货品id
     */
    private Long goodsInfoId;
    /**
     * 货品名称
     */
    private String goodsInfoName;
    /**
     * 货品数量
     */
    private Long goodsInfoNum;
    /**
     * 货品销售价格
     */
    private BigDecimal goodsInfoPrice;




}
