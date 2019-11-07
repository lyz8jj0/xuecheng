package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 李新宇
 * 2019-11-06 09:58
 */
public interface XcCompanyUserRepository extends JpaRepository<XcCompanyUser,String> {

    //根据用户id查询该用户所属公司的id
    XcCompanyUser findByUserId(String userId);
}
