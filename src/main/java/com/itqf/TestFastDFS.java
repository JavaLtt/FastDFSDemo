package com.itqf;

import org.csource.fastdfs.*;

/**
 * @author: liutong
 * @date: 2019-07-22 16:03
 */
public class TestFastDFS {

   // group1/M00/00/00/wKgRZF01osSAKbylAAA0RQcD4pU655.jpg

    public static void main(String[] args) throws Exception {
       //分支下开发
        System.out.println("ceshi");
        //声明 tracker  storage
        TrackerClient trackerClient = null;
        TrackerServer trackerServer = null;
        StorageClient storageClient = null;
        StorageServer storageServer = null;
        //1.加载配置文件
        ClientGlobal.init("client.conf");
        System.out.println(ClientGlobal.configInfo());
        //2.创建trackerclient对象
        trackerClient = new TrackerClient();
        //3.得到trackerserver对象
        trackerClient.getConnection();

        //4.创建scorageclient对象,,(server对象本身就有)
        storageClient = new StorageClient(trackerServer,storageServer);

        //5.上传图片

        String[] jpgs = storageClient.upload_file("E:\\peixun\\课堂练习\\四阶段\\part4\\FastDFSDemo\\src\\main\\resources\\2.jpg", "jpg", null);
        for (String jpg : jpgs) {
            System.out.println(jpg);
        }


    }
}
