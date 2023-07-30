package com.jingchu.flow.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Dna 对象用来描述一个领域模型或者子模型
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 9:55
 */
@Data
public class Dna {

    private long id;

    /**
     * 业务分类
     */
    private String businessType;

    /**
     * dna编码和businessType 唯一确定一个dna
     */
    private String dnaCode;

    /**
     * 序号用于排序
     */
    private int serNo;

    /**
     * 关联的父级对象
     */
    private Dna parent;

    /**
     * 一级分类
     */
    private String category;

    /**
     * 二级分类
     */
    private String secondCategory;

    /**
     * 数据库映射相关
     */
    private String dbMapCode;

    /**
     * 结构名称
     */
    private String dnaName;

    /**
     * 结构描述
     */
    private String dnaDescription;

    /**
     * 子数据最小数量
     */
    private int minCount;

    /**
     * 子数据最大数量
     */
    private int maxCount;

    /**
     * 是否递归树结构
     */
    private boolean cursive = false;

    /**
     * 子集数据
     */
    private List<Dna> children = new ArrayList<>();

    /**
     * 结构属性集合
     */
    private List<Vd> vds = new ArrayList<>();

    /**
     * 最后更新时间
     */
    private Date lastTime;

    public Dna(String businessType, String dnaCode, String dnaName, String dnaDescription) {
        this.businessType = businessType;
        this.dnaCode = dnaCode;
        this.dnaName = dnaName;
        this.dnaDescription = dnaDescription;
    }

    public void addVd(Vd vd){
        this.vds.add(vd);
    }
}
