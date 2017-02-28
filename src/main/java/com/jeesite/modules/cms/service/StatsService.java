/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.jeesite.modules.cms.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.service.BaseService;
import com.jeesite.common.utils.DateUtils;
import com.jeesite.modules.cms.dao.ArticleDao;
import com.jeesite.modules.cms.entity.Category;
import com.jeesite.modules.cms.entity.Site;
import com.jeesite.modules.sys.entity.Office;

/**
 * 统计Service
 * 
 * @author ThinkGem
 * @version 2013-05-21
 */
@Service
@Transactional(readOnly = true)
public class StatsService extends BaseService {

	@Autowired
	private ArticleDao articleDao;

	public List<Category> article(Map<String, Object> paramMap) {

		Category category = new Category();

		Site site = new Site();
		site.setId(Site.getCurrentSiteId());
		category.setSite(site);
		// DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1);
		Date beginDate = null;
		Date endDate = null;
		if (paramMap.get("beginDate") == null) {
			beginDate = DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1);
			paramMap.put("beginDate", DateUtils.formatDate(beginDate, "yyyy-MM-dd"));
		} else {
			beginDate = DateUtils.setDays(DateUtils.parseDate(paramMap.get("beginDate")), 1);
		}
		if (paramMap.get("endDate") == null) {
			endDate = DateUtils.addDays(DateUtils.addMonths(beginDate, 1), -1);
			paramMap.put("endDate", DateUtils.formatDate(endDate, "yyyy-MM-dd"));
		} else {
			endDate = DateUtils.parseDate(paramMap.get("endDate"));
		}

		category.setBeginDate(beginDate);
		category.setEndDate(endDate);
		String categoryId = (String) paramMap.get("categoryId");
		if (categoryId != null && !("".equals(categoryId))) {
			category.setId(categoryId);
			category.setParentIds(categoryId);
		}

		String officeId = (String) (paramMap.get("officeId"));
		Office office = new Office();
		if (officeId != null && !("".equals(officeId))) {
			office.setId(officeId);
			category.setOffice(office);
		} else {
			category.setOffice(office);
		}
		try {
			List<Category> list = articleDao.findStats(category);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
