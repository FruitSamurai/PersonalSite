package com.github.fruitsamurai.support.area.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/11/2 0002.
 */
public class Area {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getCommon() {
        return common;
    }

    public void setCommon(Integer common) {
        this.common = common;
    }

    public AreaType getType() {
        return type;
    }

    public void setType(AreaType type) {
        this.type = type;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<Area> getChildren() {
        return children;
    }

    public void setChildren(List<Area> children) {
        this.children = children;
    }

    private Long parentId;

    private Integer common;

    private AreaType type;

    private Date createDate;

    private Date updateDate;

    private List<Area> children;

}
