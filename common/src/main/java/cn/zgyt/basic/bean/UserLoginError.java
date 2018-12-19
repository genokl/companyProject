package cn.zgyt.basic.bean;

import java.io.Serializable;
import java.util.Date;

public class UserLoginError implements Serializable {
    private Integer id;

    private Date lastErrorTime;

    private Integer loginErrorNum;

    private String loginName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLastErrorTime() {
        return lastErrorTime;
    }

    public void setLastErrorTime(Date lastErrorTime) {
        this.lastErrorTime = lastErrorTime;
    }

    public Integer getLoginErrorNum() {
        return loginErrorNum;
    }

    public void setLoginErrorNum(Integer loginErrorNum) {
        this.loginErrorNum = loginErrorNum;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lastErrorTime=").append(lastErrorTime);
        sb.append(", loginErrorNum=").append(loginErrorNum);
        sb.append(", loginName=").append(loginName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}