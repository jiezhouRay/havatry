package com.jiezhou.havetry;


import java.util.HashMap;
import java.util.Map;

/**
 * @author 周杰
 * @date 2023/8/13
 * @description 定义数据源信息
 */
public class Configuration {
    //数据源
    private DataSource dataSource;
    //map集合： key:statementId value:MappedStatement   sql的xml的集合
    private Map<String,MappedStatement> mappedStatementMap = new HashMap<String,
                MappedStatement>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MappedStatement> getMappedStatementMap() {
        return mappedStatementMap;
    }

    public void setMappedStatementMap(Map<String, MappedStatement> mappedStatementMap) {
        this.mappedStatementMap = mappedStatementMap;
    }
}
