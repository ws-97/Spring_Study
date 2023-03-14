package com.example.container;

import com.example.example.IAir;

/**
 * @Author ws
 * @create 2023/3/9 10:43
 * @Description
 */
public class XMLInstance {

    public XMLInstance(){
        super();
    }
    public XMLInstance(String name, IAir air){
        super();
        this.name=name;
        this.air=air;
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    private IAir air;

    public void setAir(IAir air) {
        this.air = air;
    }

    public void DestroyMethod(){
        System.out.println("DestroyMethod");
    }
    public void InitMethod(){
        System.out.println("InitMethod");
    }



    public void Breath(){
        System.out.println("Name:"+this.name+";Air:"+this.air.toString());
    }
}
