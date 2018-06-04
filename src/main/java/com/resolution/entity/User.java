package com.resolution.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "APP_USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //    @NotEmpty
//    @Column(name = "FIRST_NAME", nullable = false)
    private String name;

//    @NotEmpty
//    @Column(name = "PASSWORD", nullable = false)
    private String phone;


//    @NotEmpty
//    @Column(name = "EMAIL", nullable = false)
    private String email;

//    @NotEmpty
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "APP_USER_USER_PROFILE",
//            joinColumns = {@JoinColumn(name = "USER_ID")},
//            inverseJoinColumns = {@JoinColumn(name = "USER_PROFILE_ID")})
//    private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

}