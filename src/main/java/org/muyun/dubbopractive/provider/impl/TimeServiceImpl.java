package org.muyun.dubbopractive.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.muyun.dubbopractive.TimeService;

import java.time.LocalDateTime;

@DubboService
public class TimeServiceImpl implements TimeService {
    @Override
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}
