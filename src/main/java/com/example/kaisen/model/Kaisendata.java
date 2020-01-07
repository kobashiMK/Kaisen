package com.example.kaisen.model;

public class Kaisendata {
    private String id;
    private String count;
    private String result;

public Kaisendata(String count, String result){
    this.id = id;
    this.count = count;
    this.result = result;
}

public Kaisendata(){
    this.id = null;
    this.count = null;
    this.count = null;
}

public String getId() {return id;}
public String getCount() {return count;}
public String getResult() {return result; }

public void setId(String id){this.id = id;}
public void setCount(String count){this.count = count;}
public void setResult(String result){this.result = result;}
}
