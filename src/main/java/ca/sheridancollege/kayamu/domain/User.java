package ca.sheridancollege.kayamu.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String userId;
	@NonNull
	private String firstName;
	@NonNull
	private	String lastName;
	@NonNull
	private String username;
	@NonNull
	private String password;
	@NonNull
	private String email;
	@NonNull
	private String profileImageUrl;
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate lastLoginDate;
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate lastLoginDateDisplay;
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate joinDate;
	@NonNull
	private String[] roles; //ROLE_USER{ read, edit }, ROLE_ADMIN {delete}
	@NonNull
	private String[] authorities;
	@NonNull
	private Boolean isActive;
	@NonNull
	private Boolean isNotLocked;
	
}
