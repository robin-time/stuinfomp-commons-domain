package com.lxy.stuinfomp.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 学生表学生id
     */
    private Integer sid;

    /**
     * 课程表课程id
     */
    private Integer cid;

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
     * 获取学生表学生id
     *
     * @return sid - 学生表学生id
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置学生表学生id
     *
     * @param sid 学生表学生id
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取课程表课程id
     *
     * @return cid - 课程表课程id
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 设置课程表课程id
     *
     * @param cid 课程表课程id
     */
    public void setCid(Integer cid) {
        this.cid = cid;
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