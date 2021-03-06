package com.tomorrow.orm.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhangxishuo on 2018/4/30
 * 培养计划实体
 */

@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;                          // 培养计划id

    private String name;                      // 培养计划名称

    @ManyToOne
    private Specialty specialty;              // 专业

    @ManyToMany
    private Set<Course> course = new HashSet<>();
}
