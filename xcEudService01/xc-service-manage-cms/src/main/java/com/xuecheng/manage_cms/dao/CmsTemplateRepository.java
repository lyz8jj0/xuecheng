package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 李新宇
 * 2019-08-26 17:43
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate, String> {
}
