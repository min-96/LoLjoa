package com.loljoa.server.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Rank {
    @Id
    @GeneratedValue
    private Long rankId;

    String name;

    @OneToMany(mappedBy = "rank")
    List<Account> account = new ArrayList<>();

    public Rank(String name) {
        this.name = name;
    }
}
