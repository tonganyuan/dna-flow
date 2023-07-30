package com.jingchu.flow.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 9:55
 */
@Data
public class Dna {

    private long id;

    private String businessType;

    private String dnaCode;

    private int serNo;

    private Dna parent;

    private String category;

    private String secondCategory;

    private String dbMapCode;

    private String dnaName;

    private String dnaDescription;

    private int minCount;

    private int maxCount;

    private boolean cursive =false;

    private List<Dna> children = new ArrayList<>();

    private List<Vd> vds = new ArrayList<>();

    private Date lastTime;

    public Dna(String businessType, String dnaCode, String dnaName, String dnaDescription) {
        this.businessType = businessType;
        this.dnaCode = dnaCode;
        this.dnaName = dnaName;
        this.dnaDescription = dnaDescription;
    }
}
