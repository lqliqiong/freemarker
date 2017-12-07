package com.guide.bean;

import lombok.Data;
import lombok.ToString;

/**
 * Created by youzipi on 17/1/6.
 */
@Data
@ToString
public class GoodsComment {
    private Long goodsInfoId;
    private Long commentCount;
    /**
     * 好评数量
     */
    private Long goodCount;


}
