package com.xuecheng.filesystem.dao;

import com.xuecheng.framework.domain.filesystem.FileSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 李新宇
 * 2019-09-03 10:03
 */
public interface FileSystemRepository extends MongoRepository<FileSystem, String> {
}
