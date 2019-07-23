package com.ossjk.ossjkssm.system.entity;

import com.ossjk.core.base.entity.BaseEntity;

import java.util.Date;

public class Organization extends BaseEntity {
    private Integer id;
    private String organizationName;
    private String remarks;
    private Integer sort;
    private Date crtm;
    private Date mdtm;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public Date getCrtm() {
        return crtm;
    }

    @Override
    public void setCrtm(Date crtm) {
        this.crtm = crtm;
    }

    @Override
    public Date getMdtm() {
        return mdtm;
    }

    @Override
    public void setMdtm(Date mdtm) {
        this.mdtm = mdtm;
    }

    public Organization(Integer id, String organizatioName, String remarks, Integer sort, Date crtm, Date mdtm) {
        this.id = id;
        this.organizationName = organizatioName;
        this.remarks = remarks;
        this.sort = sort;
        this.crtm = crtm;
        this.mdtm = mdtm;
    }

    public Organization() {
    }
}
