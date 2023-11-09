package com.abing.springbootinit.job.once;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author CaptainBing
 * @Date 2023/11/9 15:37
 * @Description
 */
//@Component
@Slf4j
public class OnceDemoJob implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        log.info("执行一次任务成功!!!");

    }
}
