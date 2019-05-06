package com.zkyne.serviceprovider.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class Provider implements Serializable {

    private static final long serialVersionUID = -1264895677386017987L;

    public static final Integer STATUS_YES = 0 ;

    public static final Integer STATUS_DEL = 1 ;

    public static final Integer STATUS_EXPIRE = 2 ;

    private Long providerId;
    /**
     * 供应商编码
     */
    private String providerCode;
    private String providerName;
    /**
     * 供应商商短名称
     */
    private String shortName;
    /**
     * 财务编码
     */
    private String financeIdentifier;

    /**
     * 删除状态，0正常，1删除
     */
    private Integer status;

    /**
     * 校验code
     */
    private String checkCode;

    private Date creationDate;
    private Date lastModifyDate;

    private String linkman;
    private String email;
    private Date cooperationStartDate;
    private Date cooperationEndDate;
    
    private Integer divRatio;
    private String contractPath;
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCooperationStartDate() {
        return cooperationStartDate;
    }

    public void setCooperationStartDate(Date cooperationStartDate) {
        this.cooperationStartDate = cooperationStartDate;
    }

    public Date getCooperationEndDate() {
        return cooperationEndDate;
    }

    public void setCooperationEndDate(Date cooperationEndDate) {
        this.cooperationEndDate = cooperationEndDate;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFinanceIdentifier() {
        return financeIdentifier;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public void setFinanceIdentifier(String financeIdentifier) {
        this.financeIdentifier = financeIdentifier;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	public Integer getDivRatio() {
		return divRatio;
	}

	public void setDivRatio(Integer divRatio) {
		this.divRatio = divRatio;
	}

	public String getContractPath() {
		return contractPath;
	}

	public void setContractPath(String contractPath) {
		this.contractPath = contractPath;
	}
}
