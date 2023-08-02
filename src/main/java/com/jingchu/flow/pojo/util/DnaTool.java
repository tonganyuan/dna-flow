package com.jingchu.flow.pojo.util;

import com.jingchu.flow.pojo.Cell;
import com.jingchu.flow.pojo.Dna;
import com.jingchu.flow.pojo.FilterResultCell;
import com.jingchu.flow.pojo.Vd;
import com.jingchu.flow.pojo.cons.CodeDefConst;
import com.jingchu.flow.pojo.cons.OperationFlag;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 22:26
 */
public class DnaTool {

    public static Cell singleDna2Cell(String instType, Dna dna){
        if(dna == null){
            return null;
        }
        Cell cell = null;

        if(instType.equals(CodeDefConst.INST_TYPE_DEFAULT)){
            cell = new Cell();
        }
        if(instType.equals(CodeDefConst.INST_TYPE_FILTER_RESULT)){
            cell = new FilterResultCell(dna.getDnaCode());
            cell.setOperationFlag(OperationFlag.OPERATION_FLAG_NEW);
        }
        for (Vd vd : dna.getVds()) {

        }
        return cell;
    }
}
