package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import Entity.Cliente;

public class ClienteMapDao implements IClienteDAO {
	
	private Map<Long, Cliente> map;
	
	public ClienteMapDao() {
		this.map = new HashMap<>();
	}

	@Override
	public Boolean cadastrar(Cliente cliente) {
		if(this.map.containsKey(cliente.getCpf())) {
			return false;
		}
		this.map.put(cliente.getCpf(), cliente);
		return true;
	}

	@Override
	public void excluir(Long cpf) {
		Cliente clienteCadastrado = this.map.get(cpf);
		if(clienteCadastrado != null) {
			this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
		}
		
	}

	@Override
	public void alterar(Cliente cliente) {
		Cliente clienteCadastrado = this.map.get(cliente.getCpf());
		if (clienteCadastrado != null ) {
                    long cpfAntigo = clienteCadastrado.getCpf();
                    clienteCadastrado.setName(cliente.getName());
                    clienteCadastrado.setCpf(cliente.getCpf());
                    clienteCadastrado.setEmail(cliente.getEmail());
                    clienteCadastrado.setBairro(cliente.getBairro());
                    clienteCadastrado.setEstado(cliente.getEstado());
                    
                    if ( cpfAntigo != cliente.getCpf()) {
                        this.map.remove(cpfAntigo);
                        this.map.put(cliente.getCpf(), clienteCadastrado);
                        
                    }
		}
                System.out.println(cliente.getCpf());
		
	}

	@Override
	public Cliente consultar(long cpf) {
		return this.map.get(cpf);
	}

	@Override
	public Collection<Cliente> buscartodos() {
		return this.map.values();
	}

	@Override
	public int hashCode() {
		return Objects.hash(map);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteMapDao other = (ClienteMapDao) obj;
		return Objects.equals(map, other.map);
	}

}
