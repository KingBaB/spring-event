package com.cuizb.spring.event.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Zane Cui
 * @date 2022-10-12
 */
@Configuration
@Slf4j
public class AsyncConfig {

    /**
     * 核心线程
     */
    private static final int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors();

    /**
     * 最大线程
     */
    private static final int MAX_POOL_SIZE = Runtime.getRuntime().availableProcessors() * 2;

    /**
     * 队列容量
     */
    private static final int QUEUE_CAPACITY = 10240;

    /**
     * 保持时间
     */
    private static final int KEEP_ALIVE_SECONDS = 120;

    /**
     * 名称前缀
     */
    private static final String PREFIX = "common-thread-pool-task-executor_";

    @Bean("commonThreadPoolTaskExecutor")
    public ThreadPoolTaskExecutor commonThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(CORE_POOL_SIZE);
        executor.setMaxPoolSize(MAX_POOL_SIZE);
        executor.setQueueCapacity(QUEUE_CAPACITY);
        executor.setKeepAliveSeconds(KEEP_ALIVE_SECONDS);
        executor.setThreadNamePrefix(PREFIX);
        // 超过的线程有主线程执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}