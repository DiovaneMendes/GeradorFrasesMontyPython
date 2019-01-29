package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;
	private Random generator = new Random();

	public QuoteServiceImpl(QuoteRepository repository){
		this.repository = repository;
	}

	@Override
	public Quote getQuote() {
		Integer idAleatorio = generator.nextInt(repository.findAll().size()-1);
		
		return repository.findById(idAleatorio).get();
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		List<Quote> listaQuote = repository.findAllByActor(actor);

		return listaQuote.get(generator.nextInt(listaQuote.size()));
	}
}