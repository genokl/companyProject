package cn.zgyt.basic.bean;

import java.io.Serializable;
import java.util.Date;

public class VisitInfo implements Serializable {
    private Integer id;

    private String loginIp;

    private Date loginTime;

    private String loginSource;

    private String loginOs;

    private String loginOsVersion;

    private String loginBrowser;

    private String loginBrowserCore;

    private String loginOther;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(String loginSource) {
        this.loginSource = loginSource;
    }

    public String getLoginOs() {
        return loginOs;
    }

    public void setLoginOs(String loginOs) {
        this.loginOs = loginOs;
    }

    public String getLoginOsVersion() {
        return loginOsVersion;
    }

    public void setLoginOsVersion(String loginOsVersion) {
        this.loginOsVersion = loginOsVersion;
    }

    public String getLoginBrowser() {
        return loginBrowser;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser;
    }

    public String getLoginBrowserCore() {
        return loginBrowserCore;
    }

    public void setLoginBrowserCore(String loginBrowserCore) {
        this.loginBrowserCore = loginBrowserCore;
    }

    public String getLoginOther() {
        return loginOther;
    }

    public void setLoginOther(String loginOther) {
        this.loginOther = loginOther;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginSource=").append(loginSource);
        sb.append(", loginOs=").append(loginOs);
        sb.append(", loginOsVersion=").append(loginOsVersion);
        sb.append(", loginBrowser=").append(loginBrowser);
        sb.append(", loginBrowserCore=").append(loginBrowserCore);
        sb.append(", loginOther=").append(loginOther);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}