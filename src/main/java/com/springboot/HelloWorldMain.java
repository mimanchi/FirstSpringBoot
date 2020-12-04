//主程序：启动SpringBoot应用
package com.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *@SpringBootApplication 来标注一个主程序类，说明这是一个springboot
 */
@SpringBootApplication
public class HelloWorldMain {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMain.class,args);
    }
}
