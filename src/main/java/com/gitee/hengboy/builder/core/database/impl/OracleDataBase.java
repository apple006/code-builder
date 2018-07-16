package com.gitee.hengboy.builder.core.database.impl;

import com.gitee.hengboy.builder.common.CodeBuilderProperties;
import com.gitee.hengboy.builder.core.database.AbstractDataBase;

/**
 * Oracle数据库实现
 *
 * @author：于起宇
 * ===============================
 * Created with IDEA.
 * Date：2018/7/9
 * Time：11:41 AM
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public class OracleDataBase extends AbstractDataBase {

    public OracleDataBase(CodeBuilderProperties codeBuilderProperties) {
        super(codeBuilderProperties);
    }

    /**
     * 获取表的备注信息
     *
     * @param tableName 表名
     * @return 表备注信息
     */
    public String getTableComment(String tableName) {
        // TODO 暂未支持
        return null;
    }
}