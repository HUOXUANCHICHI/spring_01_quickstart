package com.ablaze.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
/**
 * @author Lenovo
 */
public interface AccountDao {

    /**
     * 转入
     * @param name
     * @param money
     */
    @Update("update tbl_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name,@Param("money") Double money);

    /**
     * 转出
     * @param name
     * @param money
     */
    @Update("update tbl_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name") String name,@Param("money") Double money);
}
