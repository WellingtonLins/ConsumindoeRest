package br.edu.ifpb.pos.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wellington
 */
public class Artista {
    private String id;
    private String name;
    private String url;
    private String pic_small;
    private String pic_medium;
    private String uniques;
    private String views;
    private String rank;

    public Artista() {
    }

    public Artista(String id, String name, String url, String pic_small, String pic_medium, String uniques, String views, String rank) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.pic_small = pic_small;
        this.pic_medium = pic_medium;
        this.uniques = uniques;
        this.views = views;
        this.rank = rank;
    }

    
  
    @Override
    public String toString() {
        return "Artista{" + "id=" + id + ", name=" + name + ", url=" + url + ", pic_small=" + pic_small + ", pic_medium=" + pic_medium + ", uniques=" + uniques + ", views=" + views + ", rank=" + rank + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic_small() {
        return pic_small;
    }

    public void setPic_small(String pic_small) {
        this.pic_small = pic_small;
    }

    public String getPic_medium() {
        return pic_medium;
    }

    public void setPic_medium(String pic_medium) {
        this.pic_medium = pic_medium;
    }

    public String getUniques() {
        return uniques;
    }

    public void setUniques(String uniques) {
        this.uniques = uniques;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    
}
