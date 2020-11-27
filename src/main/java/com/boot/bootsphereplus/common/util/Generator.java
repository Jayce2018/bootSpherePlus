package com.boot.bootsphereplus.common.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Generator {

    public static void main(String[] args) {
        String packageName = "com.boot.bootsphereplus.business";
        //auth -> UserService, 设置成true: auth -> IUserService
        boolean serviceNameStartWithI = false;
        generateByTables(serviceNameStartWithI, packageName, "jayce", "test", "library_book");

        System.out.println("completed...");
    }

    /**
     * @param serviceNameStartWithI
     * @param packageName           包名
     * @param author                作者
     * @param database              数据库名
     * @param tableNames            表名
     */
    private static void generateByTables(boolean serviceNameStartWithI, String packageName, String author, String database, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/" + database + "?useUnicode=true&characterEncoding=UTF8&allowMultiQueries=true&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&useSSL=false";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl(dbUrl);
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setDbColumnUnderline(true);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//				strategyConfig.setSuperMapperClass("cn.saytime.mapper.BaseMapper")
        //修改替换成你需要的表名，多个表名传数组
        strategyConfig.setInclude(tableNames);
        config.setActiveRecord(false);
        config.setAuthor(author);
        config.setOutputDir("D:\\myWeb\\bootSpherePlus\\src\\main\\java");
        config.setFileOverride(true);
        config.setEnableCache(false);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                                .setMapper("mapper")
                                .setService("service")
                                .setServiceImpl("service.impl")
                                .setXml("mybatis.mappers")
                ).execute();
    }

}