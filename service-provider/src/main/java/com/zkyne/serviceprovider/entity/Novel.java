package com.zkyne.serviceprovider.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Novel
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:04
 */
public class Novel implements Serializable {

    private static final long serialVersionUID = -456142683845222341L;
    private Long novelId;
    private String title;
    private String origin;
    private String originNovelId;
    private String brief;
    private Integer isFree;
    private Integer wholePrice;
    private Integer iosPrice;
    private Integer priceUnit;
    private String keyWords;
    private String coverPic;
    private Long authorId;
    private String authorName;
    private Integer shelfStatus;
    private Integer isFinish;
    private Integer chapterCnt;
    private Integer wordCnt;
    private Long lastChapterId;
    private String lastChapterTitle;
    private Long bookUpdateTimestamp;
    private Long chapterUpdateTimestamp;
    private Integer isDel;
    private Date createDate;
    private Date modifyDate;

    public Long getNovelId() {
        return novelId;
    }

    public void setNovelId(Long novelId) {
        this.novelId = novelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginNovelId() {
        return originNovelId;
    }

    public void setOriginNovelId(String originNovelId) {
        this.originNovelId = originNovelId;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Integer getWholePrice() {
        return wholePrice;
    }

    public void setWholePrice(Integer wholePrice) {
        this.wholePrice = wholePrice;
    }

    public Integer getIosPrice() {
        return iosPrice;
    }

    public void setIosPrice(Integer iosPrice) {
        this.iosPrice = iosPrice;
    }

    public Integer getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Integer priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }

    public Integer getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Integer isFinish) {
        this.isFinish = isFinish;
    }

    public Integer getChapterCnt() {
        return chapterCnt;
    }

    public void setChapterCnt(Integer chapterCnt) {
        this.chapterCnt = chapterCnt;
    }

    public Integer getWordCnt() {
        return wordCnt;
    }

    public void setWordCnt(Integer wordCnt) {
        this.wordCnt = wordCnt;
    }

    public Long getLastChapterId() {
        return lastChapterId;
    }

    public void setLastChapterId(Long lastChapterId) {
        this.lastChapterId = lastChapterId;
    }

    public String getLastChapterTitle() {
        return lastChapterTitle;
    }

    public void setLastChapterTitle(String lastChapterTitle) {
        this.lastChapterTitle = lastChapterTitle;
    }

    public Long getBookUpdateTimestamp() {
        return bookUpdateTimestamp;
    }

    public void setBookUpdateTimestamp(Long bookUpdateTimestamp) {
        this.bookUpdateTimestamp = bookUpdateTimestamp;
    }

    public Long getChapterUpdateTimestamp() {
        return chapterUpdateTimestamp;
    }

    public void setChapterUpdateTimestamp(Long chapterUpdateTimestamp) {
        this.chapterUpdateTimestamp = chapterUpdateTimestamp;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
