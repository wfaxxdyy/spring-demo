package cn.wf.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fan.wang
 * @Date: 2020/9/25 9:51
 * @description:
 */
@RequestMapping("/test")
@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        String str = "{\"code\":0,\"message\":\"0\",\"ttl\":1,\"data\":" +
                "{\"aid\":969738617,\"bvid\":\"BV1yp4y1a7VG\",\"view\":2066754," +
                "\"danmaku\":4219,\"reply\":3996,\"favorite\":158917,\"coin\":308891," +
                "\"share\":12342,\"like\":280162,\"now_rank\":0,\"his_rank\":1," +
                "\"no_reprint\":1,\"copyright\":1,\"argue_msg\":\"\",\"evaluation\":\"\"}}";
        return str;
    }
}
