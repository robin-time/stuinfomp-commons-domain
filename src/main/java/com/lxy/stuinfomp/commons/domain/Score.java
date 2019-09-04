package com.lxy.stuinfomp.commons.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "score")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Score extends AbstractBaseDomain {
    /**
     * 学生表学生id
     */
    private Integer sid;

    /**
     * 课程表课程id
     */
    private Integer cid;

    /**
     *  成绩得分
     */
    private Integer score;
}