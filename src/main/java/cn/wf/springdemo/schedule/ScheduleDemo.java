package cn.wf.springdemo.schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
public class ScheduleDemo {

    @Scheduled(cron = "0/5 * * * * ?")
    public void testJob(){
        System.out.println(new Date());
    }

}
