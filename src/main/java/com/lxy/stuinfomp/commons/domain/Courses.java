package com.lxy.stuinfomp.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author lxy
 */
@Table(name = "courses")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Courses extends AbstractBaseDomain {

    /**
     * 课程名字
     */
    @NotNull(message = "课程名称不能为空")
    private String name;

    /**
     * 教师id
     */
    private Integer tid;

    /**
     * 获取课程名字
     *
     * @return name - 课程名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名字
     *
     * @param name 课程名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取教师id
     *
     * @return tid - 教师id
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 设置教师id
     *
     * @param tid 教师id
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }
}