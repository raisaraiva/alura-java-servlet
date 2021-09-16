package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static Integer chaveSequencial = 1;

	private static List<Empresa> lista = new ArrayList<>();

	static {
		Empresa empresaA = new Empresa();

		empresaA.setId(chaveSequencial++);
		empresaA.setNome("Alura");

		Empresa empresaB = new Empresa();

		empresaB.setId(chaveSequencial++);
		empresaB.setNome("Caelum");

		lista.add(empresaA);
		lista.add(empresaB);
	}

	// constructors

	public Banco() {
	}

	// methods

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);

		Banco.lista.add(empresa);
	}

	public Empresa buscaEmpresa(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId().equals(id)) {
				return empresa;
			}
		}

		return null;
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		lista.removeIf(emp -> emp.getId().equals(id));
	}
}
