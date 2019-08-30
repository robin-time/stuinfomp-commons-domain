package com.lxy.stuinfomp.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author lxy
 */
@Data
@Table(name = "students")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Students extends AbstractBaseDomain {
    /**
     * 学号,新增时系统生成学号，规则：grade的信息 连接 100000+max（id）的结果值；例如1号学生学号
     * 1709100001 共计9位数字组成每届学生目前最大人数100万-1，第100位学生的学号是：1709100100
     */
    @Column(name = "student_id")
    private String studentId;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 性别: 0女，1男，2其他
     */
    private String gender;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 入学年级,如1709级
     */
    private String grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 身份证号码
     */
    private String idNumber;

}