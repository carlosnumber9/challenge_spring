package com.novaquality.challenge.persistence.repository.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.novaquality.challenge.persistence.model.Category;
import com.novaquality.challenge.persistence.model.Rareness;

import com.novaquality.challenge.persistence.model.Card;
import com.novaquality.challenge.persistence.repository.CardRepository;

public class InMemoryCardRepository implements CardRepository {

	private List<Card> cards;

	public InMemoryCardRepository() {
		cards = new ArrayList<>();
		// MANA
		cards.add(new Card("Fuente de vida", "Añade 2 puntos de maná a tu contador.", Rareness.RARE, Category.MANA, 0, 0));
		cards.add(new Card("Sol de mediodía", "Añade 1 punto de maná a tu contador.", Rareness.COMMON, Category.MANA, 0, 0));
		cards.add(new Card("Cataclismo lunar", "Añade 10 puntos de maná a tu contador.", Rareness.LIMITED_EDITION, Category.MANA, 0, 0));
		// MONSTERS
		cards.add(new Card("Ogro de fuego", "Inflige daño de fuego. Odia el invierno.", Rareness.COMMON, Category.MONSTER, 1, 2));
		cards.add(new Card("Araña mutante", "Débil contra enemigos bípedos.", Rareness.COMMON, Category.MONSTER, 2, 5));
		cards.add(new Card("Maestro de dragones", "Controla un grupo de dragones. Eficaz en ataques aereos.", Rareness.RARE, Category.MONSTER, 3, 8));
		cards.add(new Card("Lobo gris", "Invoca a todas las cartas de Lobo presentes en el mazo.", Rareness.VERY_RARE, Category.MONSTER, 5, 4));
		cards.add(new Card("Señor del inframundo", "Escupe mucho fuego.", Rareness.LIMITED_EDITION, Category.MONSTER, 6, 14));
		cards.add(new Card("Verdugo ancestral", "Cuenta con su hacha.", Rareness.COMMON, Category.MONSTER, 4, 2));
		cards.add(new Card("Oso de peluche", "Vomita purpurina. Adorablemente mortal.", Rareness.COMMON, Category.MONSTER, 3, 18));
		// BLESSINGS
		cards.add(new Card("Poder del hielo", "Dobla el poder de tus monstruos de hielo.", Rareness.RARE, Category.BLESSING, 0, 0));
		cards.add(new Card("Peste", "Resta 2 puntos de vida a todos los monstruos enemigos.", Rareness.COMMON, Category.BLESSING, 0, 2));
		cards.add(new Card("Danza del tiempo", "Permite ejecutar dos movimientos en un solo turno.", Rareness.VERY_RARE, Category.BLESSING, 0, 0));
		cards.add(new Card("Berserker", "Dobla la fuerza de un monstruo, reduciendo su vida a la mitad.", Rareness.RARE, Category.BLESSING, 0, 0));
		// CURSES
		cards.add(new Card("Destino", "Tu rival te muestra su mano, permitiendote elegir su próximo movimiento.", Rareness.RARE, Category.CURSE, 0, 0));
		cards.add(new Card("Premonición", "Puedes ver las primeras 3 cartas del mazo de tu rival.", Rareness.COMMON, Category.CURSE, 0, 0));
		cards.add(new Card("Opulencia", "Las acciones de tu rival consumen el doble de maná durante 3 turnos.", Rareness.COMMON, Category.CURSE, 0, 0));
		cards.add(new Card("Rencor", "Cada monstruo del enemigo sobre el tablero le causa 1 punto de daño.", Rareness.LIMITED_EDITION, Category.CURSE, 0, 0));
	}

	/**
	 * Retrieves all cards from repository.
	 * @return list of cards
	 */
	public List<Card> findAll() {
		return this.cards;
	}

	/**
	 * Retrieves the best scored cards limited by parameter
	 * @param limit number of cards to retrieve
	 * @return a list of limit cards with the best score
	 */
	public List<Card> findByBestScore(Integer limit) {
		return this.cards.stream()
				.filter(card -> card.getScore() >= limit)
				.sorted(Comparator.comparing(Card::getScore))
				.limit(5)
				.collect(Collectors.toList());
	}

}
