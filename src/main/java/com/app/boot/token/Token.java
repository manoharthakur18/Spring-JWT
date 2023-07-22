package com.app.boot.token;


import com.app.boot.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "token")
public class Token {
	@Id
	@GeneratedValue
	private Integer id;
	private String token;

	@Enumerated(EnumType.STRING)
	private TokenType tokenType;
	
	private boolean expired;
	private boolean revoked;
	
	@ManyToOne
	@JoinColumn(name = "u_id")
	private User user;
}
