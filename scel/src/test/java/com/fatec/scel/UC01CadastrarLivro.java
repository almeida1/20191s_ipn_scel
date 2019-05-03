package com.fatec.scel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {
	static Livro umLivro = new Livro();
	@BeforeClass
	static public void setup() {
		umLivro.setIsbn("121212");
		umLivro.setTitulo("Engenharia de Software");
		umLivro.setAutor("Pressman");
	}
	

	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {

		try {
			// acao
			umLivro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT03cadastrarLivroComISBN_nulo() {
	
		try {
			// acao
			umLivro.setIsbn(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	@Test
	public void CT04cadastrarLivro_obtem_ISBN() {
		
		assertEquals("121212", umLivro.getIsbn());
		
	}
	@Test
	public void CT05Verifica_obtem_titulo() {
		
		assertEquals ("Engenharia de Software",umLivro.getTitulo() );
	}
}