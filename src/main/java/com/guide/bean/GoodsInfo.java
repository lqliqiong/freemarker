package com.guide.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    /**
     * 默认图片
     */
    private String goodsInfoImgId;

    /**
     * 库存
     */
    private Long goodsInfoStock;
    /**
     * 售价
     */
    private BigDecimal goodsInfoPreferPrice;

    /**
     * 优惠�?
     */
    private BigDecimal goodsInfoCostPrice;
    /**
     * 市场价格
     */
    private BigDecimal goodsInfoMarketPrice;
    /**
     * 第三方ID
     */
    private Long thirdId;
    /**
     * 第三商家名称
     */
    private String thirdName;

    /**
     * 虚拟销量量叠加值
     */
    private Long fictitiousSalesCount;
    /**
     * 是否是第三方 0 平台 1商家
     */
    private String isThird;

    /**
     * 是否参与会员折扣
     */
    private String isCustomerDiscount;

    /**
     * 销量
     */
    private Long saleCount;
    /**
     * 营销活动标签
     */
    private List<String> marketingLabels = new ArrayList<>(7);

    /**
     * 其他扩展属性
     */
    private Map<String,Object> extProp;
    /**
     * 评价
     */
    private GoodsComment comment;


}
