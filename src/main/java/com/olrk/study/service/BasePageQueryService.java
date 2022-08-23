package com.olrk.study.service;

import com.olrk.study.dto.request.PageQueryReq;
import com.olrk.study.dto.response.PageQueryResp;

import java.util.List;

/**
 * 分页查询基础接口
 *
 * @param <T> 入参
 * @param <R> 反参
 * @author liaoruikai
 * @date 2022-08-23
 */
public interface BasePageQueryService<T extends PageQueryReq, R extends PageQueryResp> {
    /**
     * 查询记录总量
     */
    int count(T t);

    /**
     * 分页查询
     */
    List<R> list(T t);
}
