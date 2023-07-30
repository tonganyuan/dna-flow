package com.jingchu.flow.pojo.example;

import com.jingchu.flow.pojo.cons.CodeDefConst;
import com.jingchu.flow.pojo.cons.DataType;
import com.jingchu.flow.pojo.Dna;
import com.jingchu.flow.pojo.Vd;
import java.util.Date;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 20:39
 */
public class PartyBO {

    public static Dna getPartyDna(){
        Dna partyDna = new Dna(CodeDefConst.BUSINESS_TYPE_PARTY, CodeDefConst.DNA_CODE_PARTY, CodeDefConst.DNA_NAME_PARTY, "party结构Dna");
        partyDna.setCategory(CodeDefConst.CATEGORY_PARTY);
        partyDna.setDbMapCode(CodeDefConst.DNA_DB_MAP_CODE_PARTY);
        partyDna.setCursive(false);
        partyDna.setLastTime(new Date());
        partyDna.addVd(new Vd("partyCode","party 代码", DataType.DATA_TYPE_STRING));
        partyDna.addVd(new Vd("partyName","party 名称", DataType.DATA_TYPE_STRING));
        partyDna.addVd(new Vd("birthday","出生日期", DataType.DATA_TYPE_DATE));
        partyDna.addVd(new Vd("gender","性别", DataType.DATA_TYPE_STRING));
        return partyDna;
    }
}
