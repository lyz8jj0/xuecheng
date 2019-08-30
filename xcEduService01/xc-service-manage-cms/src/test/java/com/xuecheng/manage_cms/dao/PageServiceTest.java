package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.CmsTemplate;
import com.xuecheng.manage_cms.service.PageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created by 李新宇
 * 2019-08-26 18:07
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PageServiceTest {

    @Autowired
    PageService pageService;
    @Autowired
    CmsTemplateRepository cmsTemplateRepository;



    @Test
    public void testGetPageHtml(){
        String pageHtml = pageService.getPageHtml("5cdd6b716cb3571bcd5ede07");
        System.out.println(pageHtml);
    }

    @Test
    public void test(){
//        String temp = "5aec5dd70e661808240ab7a6";
        String temp= "5aec5dd70e661808240ab7a6";
        Optional<CmsTemplate> optional = cmsTemplateRepository.findById(temp);
        if (optional.isPresent()) {
            CmsTemplate cmsTemplate = optional.get();
            System.out.println(cmsTemplate);
        }
        System.out.println("");

        String pageId  ="5cdd6b716cb3571bcd5ede07";
        CmsPage cmsPage = pageService.getById(pageId);
        System.out.println(cmsPage);

    }
}
