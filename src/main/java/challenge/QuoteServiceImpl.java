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

		Optional<Quote> quoteOptional = repository.findById(idAleatorio);

		if(quoteOptional.isPresent()){
			return quoteOptional.get();
		}
		return null;
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		Optional<Quote> quoteOptional = repository.findQuoteByActor(actor);
		if(quoteOptional.isPresent()){
			return quoteOptional.get();
		}
		return null;
	}
}
