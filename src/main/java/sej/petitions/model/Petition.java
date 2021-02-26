package sej.petitions.model;

import java.io.Serializable;
import java.util.Date;

public class Petition implements Serializable {

    private String petitionId;
    private String platform; // ex) 넷플, KBS ...
    private String category; // 장르
    private String title; // 컨텐츠 제목
    private String content; //청원 내용
    private int count; // 청원 동의 수
    private String writer; // 청원자
    private Date regDate; // 청원일

    public Petition(String petitionId, String platform, String category, String title, String content, int count, String writer, Date regDate) {
        this.petitionId = petitionId;
        this.platform = platform;
        this.category = category;
        this.title = title;
        this.content = content;
        this.count = count;
        this.writer = writer;
        this.regDate = regDate;
    }

    public Petition() {
    }

    public void increaseAgreementNum() {
        this.count++;
    }

    public String getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(String petitionId) {
        this.petitionId = petitionId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getRegDate(){
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
