package com.songzixian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author songzixian
 * @version v2.0.0
 * @create 2021-05-20 16:10
 * @see com.songzixian
 */
@EnableScheduling
@SpringBootApplication
@MapperScan("com.songzixian.mapper")
public class WeChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeChatApplication.class,args);
    }

}
