package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;
	private Random generator = new Random();;

	@Override
	public Quote getQuote() {
		int idAleatorio = generator.nextInt(repository.findAll().size());

		Optional<Quote> quote = repository.findById(idAleatorio);

		if(quote.isPresent()){
			return quote.get();
		}
		return null;
	}

	@Override
	public Quote getQuoteByActor(String actor) {

		return null;
	}
}
