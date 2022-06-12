package com.example.ApiDoAn.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.example.ApiDoAn.comom.ERole;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
    
}
