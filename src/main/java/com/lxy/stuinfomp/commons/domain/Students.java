package com.lxy.stuinfomp.commons.domain;

import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "students")
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
    @NotNull(message = "学生姓名不能为空")
    @Length(min = 5,max = 25,message = "学生名字长度介于5到25之间")
    private String name;

    /**
     * 性别: 0女，1男，2其他
     */
    @NotNull(message = "性别不能为空")
    private String sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 入学年级,如1709级
     */
    @NotNull(message = "入学年级不能为空")
    @Length(min = 4, max = 4, message = "入学年级必须4位数字，例如1709")
    private String grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 身份证号码
     */
    @Column(name = "id_number")
    @Length(min = 15,max = 18,message = "身份证必须是15位或者是18位数字")
    private String idNumber;


    /**
     * 获取学号
     *
     * @return student_id - 学号
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置学号
     *
     * @param studentId 学号
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取学生姓名
     *
     * @return name - 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名
     *
     * @param name 学生姓名
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
        return sex;
    }

    /**
     * 设置性别: 0女，1男，2其他
     *
     * @param sex 性别: 0女，1男，2其他
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取入学年级,如1709级
     *
     * @return grade - 入学年级,如1709级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置入学年级,如1709级
     *
     * @param grade 入学年级,如1709级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取身份证号码
     *
     * @return id_number - 身份证号码
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号码
     *
     * @param idNumber 身份证号码
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

}