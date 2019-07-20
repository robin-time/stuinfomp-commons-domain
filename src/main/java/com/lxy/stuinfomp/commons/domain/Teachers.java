package com.lxy.stuinfomp.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "teachers")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 教师编号


     */
    @Column(name = "teacher_number")
    private Integer teacherNumber;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 性别: 0女，1男，2其他
     */
    private String sex;

    private String phone;

    /**
     * 教师的专业
     */
    private String major;

    private String creator;

    @Column(name = "gmt_created")
    private Date gmtCreated;

    private String modifier;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取教师编号


     *
     * @return teacher_number - 教师编号


     */
    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    /**
     * 设置教师编号


     *
     * @param teacherNumber 教师编号


     */
    public void setTeacherNumber(Integer teacherNumber) {
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

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return gmt_created
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * @param gmtCreated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}