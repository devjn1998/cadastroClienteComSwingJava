package dao;

import java.util.Collection;

import Entity.Cliente;

public interface IClienteDAO {

	public Boolean cadastrar(Cliente cliente);
	public void excluir(Long cpf);
	public void alterar(Cliente cliente);
	public Cliente consultar(long cpf);
	public Collection<Cliente> buscartodos();
}
