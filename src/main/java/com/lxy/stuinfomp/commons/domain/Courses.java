package com.lxy.stuinfomp.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名字
     */
    private String name;

    /**
     * 教师id
     */
    private Integer tid;

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