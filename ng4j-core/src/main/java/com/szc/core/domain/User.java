package com.szc.core.domain;

import com.szc.core.base.BaseDomain;
import java.util.Date;

public class User extends BaseDomain {
    private Integer id;

    private String name;

    private String pwd;

    private Integer type;

    private Integer status;

    private Date created;

    private Date modified;

    private String nickName;

    public User(Integer id, String name, String pwd, Integer type, Integer status, Date created, Date modified, String nickName) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.type = type;
        this.status = status;
        this.created = created;
        this.modified = modified;
        this.nickName = nickName;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }
}