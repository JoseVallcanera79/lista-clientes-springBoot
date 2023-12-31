package com.lista.clientes.models.entity;

import java.io.Serializable;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @NotEmpty(message = "No puede estar vacio")
    @Size(min=4, max=12, message = "el tamaño tiene que estar entre 4 y 12 caracteres")
    @Column(nullable=false)
	private String nombre;
    
    @NotEmpty(message = "No puede estar vacio")
	private String apellido;
    
    @NotEmpty(message = "No puede estar vacio")
    @Email(message = "el email tiene que tener un formato válido")
    @Column(nullable=false, unique = true)
	private String email;
	
    @NotNull(message= "No puede estar vacio")
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
	private String foto;
	
	@NotNull(message = "la region no puede ser vacia")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Region region;

	/*
	 * @PrePersist public void prePersist() { createAt = new Date(); }
	 */
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	public String getFoto() {
		return foto;
	}



	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	


	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}




	private static final long serialVersionUID = 1L;


}
