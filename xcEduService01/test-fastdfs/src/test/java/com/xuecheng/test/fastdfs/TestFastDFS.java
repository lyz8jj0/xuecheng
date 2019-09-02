package com.xuecheng.test.fastdfs;

import org.csource.fastdfs.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by 李新宇
 * 2019-09-02 14:36
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFastDFS {

    //上传文件
    @Test
    public void testUpload() {
        try {
            //加载fastfds-client.properties配置文件
            ClientGlobal.initByProperties("config/fastdfs-client.properties");
            //定义TrackerClient, 用于请求TrackerServer
            TrackerClient trackerClient = new TrackerClient();
            //连接tracker
            TrackerServer trackerServer = trackerClient.getConnection();
            //获取Storage
            StorageServer storeStorage = trackerClient.getStoreStorage(trackerServer);
            //创建StorageClient
            StorageClient1 storageClient1 = new StorageClient1(trackerServer, storeStorage);
            //向storage服务器上传文件
            //本地文件的路径
            String filePath = "/Users/lixinyu/Desktop/qq.png";
            //上传成功后拿到id
            String fileId = storageClient1.upload_file1(filePath, "png", null);
            System.out.println(fileId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //下载文件
    @Test
    public void testDownload(){
        try {
            //加载fastfds-client.properties配置文件
            ClientGlobal.initByProperties("config/fastdfs-client.properties");
            //定义TrackerClient, 用于请求TrackerServer
            TrackerClient trackerClient = new TrackerClient();
            //连接tracker
            TrackerServer trackerServer = trackerClient.getConnection();
            //获取Storage
            StorageServer storeStorage = trackerClient.getStoreStorage(trackerServer);
            //创建StorageClient
            StorageClient1 storageClient1 = new StorageClient1(trackerServer, storeStorage);
            //下载文件
            String fileId = "group1/M00/00/00/wKhQZF1s59SAP5YvAAsbR34-AZc912.png";
            byte[] bytes = storageClient1.download_file1(fileId);
            //使用输出流保存文件
            FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/lixinyu/Desktop/qq1.png"));
            fileOutputStream.write(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
