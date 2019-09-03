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
@Table(name = "teachers")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Teachers extends AbstractBaseDomain {
    /**
     * 教师编号:新增教师时候，系统自动生成编号，生成规则：
     *   100000+max（id）的结果值，例如：第100位学生的学号是：100100
     */
    @Column(name = "teacher_number")
    private Long teacherNumber;

    /**
     * 教师姓名
     */
    @NotNull(message = "名字不能为空")
    private String name;

    /**
     * 性别: 0女，1男，2其他
     */
    @NotNull(message = "性别不能为空")
    private String gender;

    private String phone;

    /**
     * 教师的专业
     */
    private String major;
}