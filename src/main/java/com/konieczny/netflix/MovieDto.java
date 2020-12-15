package com.konieczny.netflix;

import java.io.Serializable;

public class MovieDto implements Serializable {
    private int id;
    private String title;
    private int year;
    private String imgSource;

    public MovieDto(){}

    public MovieDto(int id, String title, int year, String imgSource){
        this.id=id;
        this.title=title;
        this.year = year;
        this.imgSource = imgSource;
    }

    public int getId(){ return id;}
    public String getTitle(){return title;}
    public int getYear(){return year;}
    public String getImgSource(){return imgSource;}




}
