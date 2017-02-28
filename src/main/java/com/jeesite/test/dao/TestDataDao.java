/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeesite.test.dao;

import com.jeesite.common.persistence.CrudDao;
import com.jeesite.common.persistence.annotation.MyBatisDao;
import com.jeesite.test.entity.TestData;

/**
 * 单表生成DAO接口
 * 
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {

}