package com.olrk.study.dto.request;

import lombok.Data;

/**
 * 分页查询参数基类
 *
 * @author liaoruikai
 * @date 2022-08-23
 */
@Data
public class PageQueryReq {
    private int pageNum;

    private int pageSize;

    public int getPageNum() {
        if (0 >= pageNum) {
            // 页码从1开始
            return 1;
        }
        return pageNum;
    }

    public int getPageSize() {
        if (0 >= pageSize) {
            return 10;
        }
        return pageSize;
    }

    public int getOffset() {
        // 偏移量
        return (getPageNum() - 1) * getPageSize();
    }
}
