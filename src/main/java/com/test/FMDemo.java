package com.test;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lq on 2017/12/1.
 */
public class FMDemo
{
    public static void main(String[] args) throws Exception {
        String dir = "E:\\01persion\\study\\freemarker";
        Configuration conf = new Configuration(Configuration.VERSION_2_3_23);
//加载模板文件(模板的路径)
        conf.setDirectoryForTemplateLoading(new File(dir));
//配置默认字符集
        conf.setDefaultEncoding("utf-8");
// 加载模板
        Template template = conf.getTemplate("ftl/freemarker-demo.ftl");
// 定义数据
        Map root = new HashMap();
        root.put("world", "世界你好");
// 定义输出
        Writer out = new FileWriter(dir + "ftl/freemarker.html");
        template.process(root, out);
        out.flush();
        out.close();

    }
}
