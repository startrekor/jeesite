/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeesite.modules.cms.dao;

import java.util.List;

import com.jeesite.common.persistence.CrudDao;
import com.jeesite.common.persistence.annotation.MyBatisDao;
import com.jeesite.modules.cms.entity.Article;
import com.jeesite.modules.cms.entity.Category;

/**
 * 文章DAO接口
 * 
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface ArticleDao extends CrudDao<Article> {

	public List<Article> findByIdIn(String[] ids);

	public int updateHitsAddOne(String id);

	public int updateExpiredWeight(Article article);

	public List<Category> findStats(Category category);

}
