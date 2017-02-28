/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeesite.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.service.CrudService;
import com.jeesite.modules.test.dao.TestDao;
import com.jeesite.modules.test.entity.Test;

/**
 * 测试Service
 * @author ThinkGem
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
