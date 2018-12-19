package cn.zgyt.basic.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginInfoQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserLoginInfoQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginSourceIsNull() {
            addCriterion("login_source is null");
            return (Criteria) this;
        }

        public Criteria andLoginSourceIsNotNull() {
            addCriterion("login_source is not null");
            return (Criteria) this;
        }

        public Criteria andLoginSourceEqualTo(String value) {
            addCriterion("login_source =", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceNotEqualTo(String value) {
            addCriterion("login_source <>", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceGreaterThan(String value) {
            addCriterion("login_source >", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceGreaterThanOrEqualTo(String value) {
            addCriterion("login_source >=", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceLessThan(String value) {
            addCriterion("login_source <", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceLessThanOrEqualTo(String value) {
            addCriterion("login_source <=", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceLike(String value) {
            addCriterion("login_source like", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceNotLike(String value) {
            addCriterion("login_source not like", value, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceIn(List<String> values) {
            addCriterion("login_source in", values, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceNotIn(List<String> values) {
            addCriterion("login_source not in", values, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceBetween(String value1, String value2) {
            addCriterion("login_source between", value1, value2, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginSourceNotBetween(String value1, String value2) {
            addCriterion("login_source not between", value1, value2, "loginSource");
            return (Criteria) this;
        }

        public Criteria andLoginOsIsNull() {
            addCriterion("login_os is null");
            return (Criteria) this;
        }

        public Criteria andLoginOsIsNotNull() {
            addCriterion("login_os is not null");
            return (Criteria) this;
        }

        public Criteria andLoginOsEqualTo(String value) {
            addCriterion("login_os =", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsNotEqualTo(String value) {
            addCriterion("login_os <>", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsGreaterThan(String value) {
            addCriterion("login_os >", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsGreaterThanOrEqualTo(String value) {
            addCriterion("login_os >=", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsLessThan(String value) {
            addCriterion("login_os <", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsLessThanOrEqualTo(String value) {
            addCriterion("login_os <=", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsLike(String value) {
            addCriterion("login_os like", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsNotLike(String value) {
            addCriterion("login_os not like", value, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsIn(List<String> values) {
            addCriterion("login_os in", values, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsNotIn(List<String> values) {
            addCriterion("login_os not in", values, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsBetween(String value1, String value2) {
            addCriterion("login_os between", value1, value2, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsNotBetween(String value1, String value2) {
            addCriterion("login_os not between", value1, value2, "loginOs");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionIsNull() {
            addCriterion("login_os_version is null");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionIsNotNull() {
            addCriterion("login_os_version is not null");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionEqualTo(String value) {
            addCriterion("login_os_version =", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionNotEqualTo(String value) {
            addCriterion("login_os_version <>", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionGreaterThan(String value) {
            addCriterion("login_os_version >", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("login_os_version >=", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionLessThan(String value) {
            addCriterion("login_os_version <", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionLessThanOrEqualTo(String value) {
            addCriterion("login_os_version <=", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionLike(String value) {
            addCriterion("login_os_version like", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionNotLike(String value) {
            addCriterion("login_os_version not like", value, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionIn(List<String> values) {
            addCriterion("login_os_version in", values, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionNotIn(List<String> values) {
            addCriterion("login_os_version not in", values, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionBetween(String value1, String value2) {
            addCriterion("login_os_version between", value1, value2, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginOsVersionNotBetween(String value1, String value2) {
            addCriterion("login_os_version not between", value1, value2, "loginOsVersion");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserIsNull() {
            addCriterion("login_browser is null");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserIsNotNull() {
            addCriterion("login_browser is not null");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserEqualTo(String value) {
            addCriterion("login_browser =", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotEqualTo(String value) {
            addCriterion("login_browser <>", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserGreaterThan(String value) {
            addCriterion("login_browser >", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("login_browser >=", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserLessThan(String value) {
            addCriterion("login_browser <", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserLessThanOrEqualTo(String value) {
            addCriterion("login_browser <=", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserLike(String value) {
            addCriterion("login_browser like", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotLike(String value) {
            addCriterion("login_browser not like", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserIn(List<String> values) {
            addCriterion("login_browser in", values, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotIn(List<String> values) {
            addCriterion("login_browser not in", values, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserBetween(String value1, String value2) {
            addCriterion("login_browser between", value1, value2, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotBetween(String value1, String value2) {
            addCriterion("login_browser not between", value1, value2, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreIsNull() {
            addCriterion("login_browser_core is null");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreIsNotNull() {
            addCriterion("login_browser_core is not null");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreEqualTo(String value) {
            addCriterion("login_browser_core =", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreNotEqualTo(String value) {
            addCriterion("login_browser_core <>", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreGreaterThan(String value) {
            addCriterion("login_browser_core >", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreGreaterThanOrEqualTo(String value) {
            addCriterion("login_browser_core >=", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreLessThan(String value) {
            addCriterion("login_browser_core <", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreLessThanOrEqualTo(String value) {
            addCriterion("login_browser_core <=", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreLike(String value) {
            addCriterion("login_browser_core like", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreNotLike(String value) {
            addCriterion("login_browser_core not like", value, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreIn(List<String> values) {
            addCriterion("login_browser_core in", values, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreNotIn(List<String> values) {
            addCriterion("login_browser_core not in", values, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreBetween(String value1, String value2) {
            addCriterion("login_browser_core between", value1, value2, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserCoreNotBetween(String value1, String value2) {
            addCriterion("login_browser_core not between", value1, value2, "loginBrowserCore");
            return (Criteria) this;
        }

        public Criteria andLoginOtherIsNull() {
            addCriterion("login_other is null");
            return (Criteria) this;
        }

        public Criteria andLoginOtherIsNotNull() {
            addCriterion("login_other is not null");
            return (Criteria) this;
        }

        public Criteria andLoginOtherEqualTo(String value) {
            addCriterion("login_other =", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherNotEqualTo(String value) {
            addCriterion("login_other <>", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherGreaterThan(String value) {
            addCriterion("login_other >", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherGreaterThanOrEqualTo(String value) {
            addCriterion("login_other >=", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherLessThan(String value) {
            addCriterion("login_other <", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherLessThanOrEqualTo(String value) {
            addCriterion("login_other <=", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherLike(String value) {
            addCriterion("login_other like", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherNotLike(String value) {
            addCriterion("login_other not like", value, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherIn(List<String> values) {
            addCriterion("login_other in", values, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherNotIn(List<String> values) {
            addCriterion("login_other not in", values, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherBetween(String value1, String value2) {
            addCriterion("login_other between", value1, value2, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginOtherNotBetween(String value1, String value2) {
            addCriterion("login_other not between", value1, value2, "loginOther");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(Integer value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(Integer value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(Integer value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(Integer value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(Integer value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<Integer> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<Integer> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(Integer value1, Integer value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}