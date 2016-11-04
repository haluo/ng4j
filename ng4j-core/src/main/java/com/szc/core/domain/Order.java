package com.szc.core.domain;

import com.szc.core.base.BaseDomain;
import java.util.Date;

public class Order extends BaseDomain {
    private Integer id;

    private String userName;

    private Integer type;

    private Date modified;

    private Date created;

    public Order(Integer id, String userName, Integer type, Date modified, Date created) {
        this.id = id;
        this.userName = userName;
        this.type = type;
        this.modified = modified;
        this.created = created;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}