package cn.ivdone.blog.dao.entity;

import lombok.Data;


@Data
public class User {

    private Long id ;

    private String username ;

    private String password ;

    private String nickname ;

    private Data create_time ;

    private String email ;
}
