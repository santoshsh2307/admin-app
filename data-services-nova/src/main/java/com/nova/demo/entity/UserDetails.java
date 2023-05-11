package com.nova.demo.entity;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="user_details")
	public class UserDetails {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Long id;
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
		@Column(name="user_name")
		private String userName;
		@Column(name="password")
		private String password;
		@Column(name="email")
		private String mail;
		@Column(name="phone")
		private String phone;
		@Column(name="gender")
		private char gender;
		@Column(name="role_id")
		private int roleId;
		@Column(name="created_at")
		private Boolean createdAt;
		@Column(name="status")
		private Boolean status;
		@Column(name="is_deleted")
		private Boolean isDeleted;
		@Column(name="owner_id")
		private Long ownerId;
		public UserDetails() {
			
		}
		public UserDetails(Long id, String firstName, String lastName, String userName, String password, String mail,
				String phone, char gender, int roleId, Boolean createdAt, Boolean status, Boolean isDeleted,
				Long ownerId) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.password = password;
			this.mail = mail;
			this.phone = phone;
			this.gender = gender;
			this.roleId = roleId;
			this.createdAt = createdAt;
			this.status = status;
			this.isDeleted = isDeleted;
			this.ownerId = ownerId;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public int getRoleId() {
			return roleId;
		}
		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}
		public Boolean getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Boolean createdAt) {
			this.createdAt = createdAt;
		}
		public Boolean getStatus() {
			return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
		public Boolean getIsDeleted() {
			return isDeleted;
		}
		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}
		public Long getOwnerId() {
			return ownerId;
		}
		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}
		@Override
		public String toString() {
			return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
					+ userName + ", password=" + password + ", mail=" + mail + ", phone=" + phone + ", gender=" + gender
					+ ", roleId=" + roleId + ", createdAt=" + createdAt + ", status=" + status + ", isDeleted="
					+ isDeleted + ", ownerId=" + ownerId + "]";
		}
		
		
		
		
	}
		