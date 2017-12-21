package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableArt.class)
@JsonSerialize(as = ImmutableArt.class)
public interface Art {

    public String id();
    public String name();
    public String url();
    public String pic_small();
    public String pic_medium();
    public String uniques();
    public String views();
    public String rank();
    
//"id":"3ade68b7g30dd1ea3",
//"name":"Ed Sheeran",
//"url":"https:\/\/www.vagalume.com.br\/ed-sheeran\/",
//"pic_small":"https:\/\/s2.vagalume.com\/ed-sheeran\/images\/profile.jpg",
//"pic_medium":"https:\/\/s2.vagalume.com\/ed-sheeran\/images\/ed-sheeran.jpg",
//"uniques":"208002",
//"views":"366369",
//"rank":"202.6"
    
}