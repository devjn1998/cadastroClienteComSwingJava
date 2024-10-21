package Entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Cliente {
	private String name;
	private Long cpf;
	private String email;
	private String estado;
	private String bairro;
        private LocalDate data;
        private LocalTime hora;

	public Cliente(String name, Long cpf, String email, String estado, String bairro, LocalDate data, LocalTime hora) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.estado = estado;
		this.bairro = bairro;
                this.data = data;
                this.hora = hora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long long1) {
		this.cpf = long1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
        
        public LocalDate getData () {
            return data;
        }
        
        public void setData(LocalDate data) {
            this.data = data;
        }
        
        public LocalTime getHora() {
            return hora;
        }
        
        public void setHora(LocalTime hora) {
            this.hora = hora;
        }
        
        


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(email, other.email) && Objects.equals(estado, other.estado)
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cpf, email, estado, name);
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", cpf=" + cpf + "]";
	}
	
	
	

}
