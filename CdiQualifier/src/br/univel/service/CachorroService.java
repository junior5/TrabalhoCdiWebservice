package br.univel.service;

import br.univel.interfaces.AnimalService;
import br.univel.qualifiers.Cachorro;

@Cachorro
public class CachorroService implements AnimalService {

	@Override
	public String latir() {
		return "Au Au Au";
	}

}
