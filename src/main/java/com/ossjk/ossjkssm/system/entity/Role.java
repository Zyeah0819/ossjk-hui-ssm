package com.ossjk.ossjkssm.system.entity;

import com.ossjk.core.base.entity.BaseEntity;

import java.util.Date;

public class Role extends BaseEntity {
    private Integer id;
    private String roleName;
    private String remarks;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Role(Integer id, String roleName, String remarks, Date crtm, Date mdtm) {
        this.id = id;
        this.roleName = roleName;
        this.remarks = remarks;
        this.crtm = crtm;
        this.mdtm = mdtm;
    }

    public Role() {
    }
}
