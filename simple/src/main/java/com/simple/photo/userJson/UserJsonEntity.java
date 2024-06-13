package com.simple.photo.userJson;

import org.json.simple.JSONObject;

import com.simple.photo.user.UserEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity(name = "userJson")
public class UserJsonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jsonId;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "UserNum")
	private Long jserNum;
	
	@Column(columnDefinition = "JSON")
	private JSONObject jsonFile;
	
	@Column(columnDefinition = "TEXT")
	private String jsonName;
}