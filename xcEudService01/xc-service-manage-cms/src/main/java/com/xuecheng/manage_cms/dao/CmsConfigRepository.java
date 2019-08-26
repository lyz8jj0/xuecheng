package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 李新宇
 * 2019-08-26 11:58
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig, String> {
}
