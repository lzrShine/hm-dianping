package com.hmdp.utils;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 梁峥嵘
 */
@Data
public class RedisData {
    private LocalDateTime expireTime;
    private Object data;
}
