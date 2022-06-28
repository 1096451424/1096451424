package com.ldj.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MybatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://118.31.111.190:3306/ldj", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("ldj")//设置作者
                            .fileOverride()//覆盖已生成文件
                            .outputDir(System.getProperty("user.dir") + "/src/main/java");//指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ldj")//设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "/src/main/resources/mapper/"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t1");//设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
