package com.xuecheng.api.filesystem;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 李新宇
 * 2019-09-03 09:56
 */
@Api(value = "文件管理接口", description = "文件管理接口, 提供页面的增, 删, 改, 查")
public interface FileSystemControllerApi {

    //上传文件
    @ApiOperation("上传文件接口")
    public UploadFileResult upload(MultipartFile multipartFile,
                                   String filetag,
                                   String businesskey,
                                   String metadata);
}
