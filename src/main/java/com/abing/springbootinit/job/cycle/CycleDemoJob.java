package com.abing.springbootinit.job.cycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author CaptainBing
 * @Date 2023/11/9 15:38
 * @Description
 */
//@Component
@Slf4j
public class CycleDemoJob {

    @Scheduled(fixedRate = 5000)
    public void doCycleDemoJob(){
        log.info("循环执行示例 每5秒执行一次");
    }

}
