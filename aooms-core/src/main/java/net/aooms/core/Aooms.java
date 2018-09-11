package net.aooms.core;

import net.aooms.core.datasource.DynamicDataSource;
import net.aooms.core.module.mybatis.Db;
import net.aooms.core.property.PropertyObject;
import net.oschina.j2cache.CacheChannel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

/**
 * 框架模块访问接口
 * Created by 风象南(cheereebo) on 2018-04-18
 */
public class Aooms {

    // 框架core包
    public static final String CORE_PACKAGE = "net.aooms.core";

    private static Aooms INSTANCE;

    @Autowired
    private CacheChannel j2Cache;

    @Autowired
    private Db db;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private PropertyObject propertyObject;

    void instance(Aooms aooms){
        INSTANCE = aooms;
    }

    public static Aooms self(){
        return INSTANCE;
    }

    public Db getDb() {
        return db;
    }

    public CacheChannel getJ2Cache() {
        return j2Cache;
    }

    public DynamicDataSource getDynamicDataSource() {
        return (DynamicDataSource) dataSource;
    }

    public PropertyObject getPropertyObject(){
        return propertyObject;
    }

}