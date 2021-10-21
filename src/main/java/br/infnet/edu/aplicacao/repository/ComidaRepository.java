package br.infnet.edu.aplicacao.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import br.infnet.edu.aplicacao.model.Comida;

@Component
public class ComidaRepository {

	private static List<Comida> comidaList = new ArrayList<>();
    
	public Comida save(String nome) {
		Integer preco = generatePreco();
		while (findByPreco(preco)!= null) {
			preco = generatePreco();	
		}
	
		Comida comida = new Comida(nome, preco);
		comida.setNome(nome);
		comida.setPreco(preco);
		comidaList.add(comida);
		return null;
	}
	
	private Integer generatePreco() {
		Random r = new Random();
		return r.nextInt(1000);
		
	}

	public Comida findByPreco(Integer preco) {
		if(preco == 0) {
			return null;
		}
		
	for(Comida c : comidaList) {
		if(c.getPreco().equals(preco)) {
			return c;
			}
 	       }
			return null;  
	}
	
	public Comida update(Integer preco, String nome) {
		Comida comida = findByPreco(preco);
		if(comida != null) {
			comida.setNome(nome);
		}
		return comida;
	}
	
	public List<Comida> findAll(){
		return comidaList;
	}
	
	public void delete(Integer preco) {
		Comida comida = findByPreco(preco);
		if(comida != null) {
			comidaList.remove(comida);
		}
		
	}
		
		
	}

