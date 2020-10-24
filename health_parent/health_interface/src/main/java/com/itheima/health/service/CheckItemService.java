package com.itheima.health.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.pojo.CheckItem;

import java.util.List;


public interface CheckItemService {
    List<CheckItem> findAll();

    void add(CheckItem checkItem);
}
