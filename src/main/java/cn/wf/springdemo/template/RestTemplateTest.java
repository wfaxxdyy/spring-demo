package cn.wf.springdemo.template;

import cn.wf.springdemo.model.Video;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: fan.wang
 * @Date: 2020/9/25 9:08
 * @description:
 */
public class RestTemplateTest {

    @Test
    public void test(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.bilibili.com/x/web-interface/archive/stat?aid=969738617";
        String video = restTemplate.getForObject(url, String.class);
        System.out.println(video);
    }

}
