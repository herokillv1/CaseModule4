package com.quan.demo.models;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Data
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String account;

    @NotEmpty
    private String password;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String name;

    @Min(18)
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_render")
    private Render render;

    @NotEmpty
    private String address;

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10,11})" , message = "Invalid phone number")
    private String phone;
    private Date datecreated;
    private String avatar;

    @Transient
    private MultipartFile image;

    @ManyToOne
    @JoinColumn(name = "idrole")
    private Roles roles;
}
