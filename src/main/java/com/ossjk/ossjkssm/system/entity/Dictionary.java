package com.ossjk.ossjkssm.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ossjk.core.base.entity.BaseEntity;
/*这里要用java.util的date包，不能用sql的，用sql只能读取到年月日*/
import java.util.Date;


public class Dictionary extends BaseEntity {
    private Integer id;
    private String dkey;
    private String dvalue;
    /*@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")*/
    private Date crtm;
    private Date mdtm;

    public Dictionary(Integer id, String dkey, String dvalue, Date crtm, Date mdtm) {
        this.id = id;
        this.dkey = dkey;
        this.dvalue = dvalue;
        this.crtm = crtm;
        this.mdtm = mdtm;
    }

    public Dictionary() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDkey() {
        return dkey;
    }

    public void setDkey(String dkey) {
        this.dkey = dkey;
    }

    public String getDvalue() {
        return dvalue;
    }

    public void setDvalue(String dvalue) {
        this.dvalue = dvalue;
    }

    public Date getCrtm() {
        return crtm;
    }

    public void setCrtm(Date crtm) {
        this.crtm = crtm;
    }

    public Date getMdtm() {
        return mdtm;
    }

    public void setMdtm(Date mdtm) {
        this.mdtm = mdtm;
    }
}
