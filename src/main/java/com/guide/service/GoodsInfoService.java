package com.guide.service;

import com.alibaba.fastjson.JSON;
import com.guide.Util.JsonToString;
import com.guide.bean.GoodsInfo;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;


/**
 * Created by lq on 2017/12/1.
 */
@Service
public class GoodsInfoService {

    /**
     * 获取商品列表
     *
     * @return
     */
    public List<GoodsInfo>  getGoodsList() {

        //从文件读取数据--真实开发过程中会从数据库中拿数据
        URL url = GoodsInfoService.class.getClassLoader().getResource("data/goodsList.json");
        String str = JsonToString.ReadFile(url.getPath());

        /**
         * json
         * 对象转换成java对象
         */
        List<GoodsInfo> list = JSON.parseArray(str, GoodsInfo.class);
        return list;
    }




    /**
     * 获取商品信息详情
     *
     * @return
     */
    public GoodsInfo getGoodsInfo() {

        //从文件读取数据--真实开发过程中会从数据库中拿数据
        URL url = GoodsInfoService.class.getClassLoader().getResource("data/goodsinfo.json");
        String str = JsonToString.ReadFile(url.getPath());

        /**
         * json
         * 对象转换成java对象
         */
        GoodsInfo info = JSON.parseObject(str, GoodsInfo.class);
        return info;
    }


}
