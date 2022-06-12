package com.example.ApiDoAn.entity;

import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "userName"),
        })
public class UserEntity extends BaseEntity {

 
//    @Length(min = 5,max = 20, message = "*Your password must have at least 5 characters")
    @Column
    private String userName;
    @Column
 
    private String email;
    @Column

    private String passwords;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "userRoles",
            joinColumns = @JoinColumn(name = "userID"), inverseJoinColumns = @JoinColumn(name = "roleID"))
    private Set<RoleEntity> roles = new HashSet<>();
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String gender;
    @Column
    private boolean enabled;
    @Column
    private int verificationCode;
    @Column
    private int verifiForgot;
    @Column
    private String statuss;

    @OneToOne(mappedBy = "userEntity")
    private RefreshTokenEntity refreshToken;

    public UserEntity(String username, String email, String password) {
        this.userName = username;
        this.email = email;
        this.passwords = password;
    }

    public UserEntity(String username,String email) {
        this.userName = username;
        this.email = email;

    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Set<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleEntity> roles) {
		this.roles = roles;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(int verificationCode) {
		this.verificationCode = verificationCode;
	}

	public int getVerifiForgot() {
		return verifiForgot;
	}

	public void setVerifiForgot(int verifiForgot) {
		this.verifiForgot = verifiForgot;
	}

	public String getStatuss() {
		return statuss;
	}

	public void setStatuss(String statuss) {
		this.statuss = statuss;
	}

	public RefreshTokenEntity getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(RefreshTokenEntity refreshToken) {
		this.refreshToken = refreshToken;
	}
    

}
