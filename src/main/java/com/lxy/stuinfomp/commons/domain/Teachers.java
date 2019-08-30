package com.lxy.stuinfomp.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author lxy
 */
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



    /**
     * 获取教师编号
     * @return teacher_number - 教师编号
     */
    public Long getTeacherNumber() {
        return teacherNumber;
    }

    /**
     * 设置教师编号


     *
     * @param teacherNumber 教师编号


     */
    public void setTeacherNumber(Long teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    /**
     * 获取教师姓名
     *
     * @return name - 教师姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置教师姓名
     *
     * @param name 教师姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别: 0女，1男，2其他
     *
     * @return sex - 性别: 0女，1男，2其他
     */
    public String getSex() {
        return gender;
    }

    /**
     * 设置性别: 0女，1男，2其他
     *
     * @param sex 性别: 0女，1男，2其他
     */
    public void setSex(String sex) {
        this.gender = sex;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取教师的专业
     *
     * @return major - 教师的专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置教师的专业
     *
     * @param major 教师的专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

}