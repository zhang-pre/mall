package com.atguigu.gulimall.thirdparty;


import com.aliyun.oss.OSSClient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {
	@Resource
	private OSSClient ossClient;
	@Test
	void contextLoads() throws FileNotFoundException {
		//上传文件流。
		InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\下载.jfif");
		ossClient.putObject("mall-zbb", "hahaha1.jfif", inputStream);

		// 关闭OSSClient。
		ossClient.shutdown();
		System.out.println("上传成功.");
	}

}
