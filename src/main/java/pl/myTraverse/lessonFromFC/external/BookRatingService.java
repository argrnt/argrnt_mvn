package pl.myTraverse.lessonFromFC.external;

import pl.myTraverse.lessonFromFC.model.Author;

public interface BookRatingService {

    double getRating(String title, Author author) throws IllegalStateException;

}
