package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 李新宇
 * 2019-08-26 11:58
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite, String> {
}
