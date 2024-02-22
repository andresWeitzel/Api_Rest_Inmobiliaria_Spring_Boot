package com.sistema_inmobiliaria.entities;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="propietarios_inmuebles")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropietarioInmueble {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id", nullable=false , unique=true)
	@JsonProperty("id")
	private int id;
	
	@Column(name="name", nullable=false, length=100)
	@JsonProperty("name")
	private String name;
	
	@Column(name="last_name", nullable=false, length=100)
	@JsonProperty("last_name")
	private String lastName;
	
	@Column(name="age", nullable=false)
	@JsonProperty("age")
	private int age;
	
	@Column(name="fecha_nacimiento", nullable=false)
	private Date fechaNac;
	
	@Column(name="tipo_documento", nullable=false, length=30)
	private String tipoDoc;
	
	@Column(name="nro_documento", nullable=false, length=50 , unique=true)
	private String nroDoc;
	
	@Column(name="direccion", nullable=false, length=100 )
	private String direc;
	
	@Column(name="nro_telefono_principal", nullable=false, length=40 , unique=true)
	private String nroTelPrinc;
	
	@Column(name="nro_telefono_secundario", nullable=true, length=50 )
	private String nroTelSec;
	
	@Column(name="email", nullable=true, length=50 , unique=true)
	private String email;

	@Column(name="created_at", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonProperty("created_at")
	private Date createdAt;
	
	@Column(name="updated_at", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonProperty("updated_at")
	private Date updatedAt;
	
	
	
}
