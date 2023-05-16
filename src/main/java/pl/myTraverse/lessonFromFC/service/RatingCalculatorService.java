package pl.myTraverse.lessonFromFC.service;

import pl.myTraverse.lessonFromFC.external.BookRatingService;
import pl.myTraverse.lessonFromFC.model.Book;
import pl.myTraverse.lessonFromFC.model.Rating;

public class RatingCalculatorService {

    private final BookRatingService bookRatingService;
    private final RatingCalculator ratingCalculator;

    public RatingCalculatorService(BookRatingService bookRatingService) {
        this.bookRatingService = bookRatingService;
        this.ratingCalculator=new RatingCalculator();
    }

    public Rating calculateWithExternalService(Book book) throws IllegalStateException{

            double averageOpinion = bookRatingService.getRating(book.getTitle(), book.getAuthor());
            return ratingCalculator.calculateRating(averageOpinion);

    }


}
