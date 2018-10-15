package com.example.demojpatestsunday;

import javax.persistence.*;

@Entity
@Table(name = "tb_sample")
public class SampleDTO {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sampleId;

    @Column
    private String msg;

    @Column
    private int msgCode;

    public SampleDTO() {
    }

    public SampleDTO(String msg, int msgCode) {
        this.msg = msg;
        this.msgCode = msgCode;
    }

    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(int msgCode) {
        this.msgCode = msgCode;
    }
}
