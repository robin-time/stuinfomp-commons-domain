package com.lxy.stuinfomp.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author lxy
 */
@Data
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
     * 课程编号
     */
    @Column(name = "course_number")
    private Long courseNumber;

}