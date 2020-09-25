package cn.wf.springdemo.model;

import lombok.Data;

/**
 * @Author: fan.wang
 * @Date: 2020/9/25 9:13
 * @description:
 */
@Data
public class Video {

    /**
     * id
     */
    private Long aid;

    /**
     * 点赞
     */
    private String like;

    /**
     * 硬币
     */
    private String coin;

    /**
     * 收藏
     */
    private String favorite;

    /**
     * 转发
     */
    private String share;

}
