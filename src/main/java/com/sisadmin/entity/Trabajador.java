package com.sisadmin.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sa_trabajador")
public class Trabajador {
	
	private long id;	   
	   private String dni;
	   private String nombre;
	   private String direccion;
	   private Date fechaNacimiento;
	   private String estadoCivil;
	   private Sede sede;
	   private Departamento departamento;
	   private TipoTrabajador tipoTrabajador;
	   private PuestoTrabajo puestoTrabajo;
	   private String usuarioCreacion;
	   private String usuarioModificacion;
	   private Timestamp fechaCreacion;
	   private Timestamp fechaModificacion;
	   
	   @Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)  
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		@Column(name="dni")
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		
		@Column(name="direccion")
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		@Column(name="fecha_nacimiento")
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		
		@Column(name="estado_civil")
		public String getEstadoCivil() {
			return estadoCivil;
		}
		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		
		@ManyToOne
		@JoinColumn(name="sede_id")
		public Sede getSede() {
			return sede;
		}
		public void setSede(Sede sede) {
			this.sede = sede;
		}
		
		@ManyToOne
		@JoinColumn(name="departamento_id")
		public Departamento getDepartamento() {
			return departamento;
		}
		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		
		@ManyToOne
		@JoinColumn(name="tipo_trabajador_id")
		public TipoTrabajador getTipoTrabajador() {
			return tipoTrabajador;
		}
		public void setTipoTrabajador(TipoTrabajador tipoTrabajador) {
			this.tipoTrabajador = tipoTrabajador;
		}
		
		@ManyToOne
		@JoinColumn(name="puesto_trabajo_id")
		public PuestoTrabajo getPuestoTrabajo() {
			return puestoTrabajo;
		}
		public void setPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
			this.puestoTrabajo = puestoTrabajo;
		}
		
		@Column(name="nombre")
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		   
		@Column(name = "usuario_creacion")
		public String getUsuarioCreacion() {
			return usuarioCreacion;
		}
		public void setUsuarioCreacion(String usuarioCreacion) {
			this.usuarioCreacion = usuarioCreacion;
		}
		
		@Column(name = "usuario_modificacion")
		public String getUsuarioModificacion() {
			return usuarioModificacion;
		}
		public void setUsuarioModificacion(String usuarioModificacion) {
			this.usuarioModificacion = usuarioModificacion;
		}
		
		@Column(name = "fecha_creacion")
		public Timestamp getFechaCreacion() {
			return fechaCreacion;
		}
		public void setFechaCreacion(Timestamp fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}
		
		@Column(name = "fecha_modificacion")
		public Timestamp getFechaModificacion() {
			return fechaModificacion;
		}
		public void setFechaModificacion(Timestamp fechaModificacion) {
			this.fechaModificacion = fechaModificacion;
		}   
	   
	   
	
}
