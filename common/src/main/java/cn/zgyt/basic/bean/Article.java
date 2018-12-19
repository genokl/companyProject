package cn.zgyt.basic.bean;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer id;

    private String articleTitle;

    private Integer articleType;

    private String articleSynopsis;

    private Integer isDel;

    private Integer isShow;

    private String articleSynopsisImg;

    private String articleHtmlAddress;

    private Date createDate;

    private String keyWords;

    private String articleDetail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public String getArticleSynopsis() {
        return articleSynopsis;
    }

    public void setArticleSynopsis(String articleSynopsis) {
        this.articleSynopsis = articleSynopsis == null ? null : articleSynopsis.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getArticleSynopsisImg() {
        return articleSynopsisImg;
    }

    public void setArticleSynopsisImg(String articleSynopsisImg) {
        this.articleSynopsisImg = articleSynopsisImg == null ? null : articleSynopsisImg.trim();
    }

    public String getArticleHtmlAddress() {
        return articleHtmlAddress;
    }

    public void setArticleHtmlAddress(String articleHtmlAddress) {
        this.articleHtmlAddress = articleHtmlAddress == null ? null : articleHtmlAddress.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    public String getArticleDetail() {
        return articleDetail;
    }

    public void setArticleDetail(String articleDetail) {
        this.articleDetail = articleDetail == null ? null : articleDetail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleType=").append(articleType);
        sb.append(", articleSynopsis=").append(articleSynopsis);
        sb.append(", isDel=").append(isDel);
        sb.append(", isShow=").append(isShow);
        sb.append(", articleSynopsisImg=").append(articleSynopsisImg);
        sb.append(", articleHtmlAddress=").append(articleHtmlAddress);
        sb.append(", createDate=").append(createDate);
        sb.append(", keyWords=").append(keyWords);
        sb.append(", articleDetail=").append(articleDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}