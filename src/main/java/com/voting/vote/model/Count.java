package com.voting.vote.model;

public class Count {
    public int id;
    public String username;
    public String password;
    public String mobileNo;
    public String aadharNo;
    public String registrationNo;
    public String category;
    public String voteStatus;
    long count;

    public Count(int id, String username, String password, String mobileNo, String aadharNo, String registrationNo, String category, String voteStatus, long count) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mobileNo = mobileNo;
        this.aadharNo = aadharNo;
        this.registrationNo = registrationNo;
        this.category = category;
        this.voteStatus = voteStatus;
        this.count = count;
    }
}
