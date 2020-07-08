package com.my.ttms.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class Seats {
    //s: {"seat":[{"row":"5","col":"5"},{"row":"5","col":"6"},{"row":"5","col":"7"}],
    // "scheduleid":"5","studio":"1","price":"45","userid":null,"count":"3"}
    private List<Map> seat;
    private int scheduleid;
    private int studio;
    private  Double price;
    private  int  userid;
    private  int count;

}
