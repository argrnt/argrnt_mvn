package pl.myTraverse.lessonFromFC.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.myTraverse.lessonFromFC.external.BookRatingService;
import pl.myTraverse.lessonFromFC.model.Author;
import pl.myTraverse.lessonFromFC.model.Book;
import pl.myTraverse.lessonFromFC.model.BookCategory;
import pl.myTraverse.lessonFromFC.model.Rating;

import static org.junit.jupiter.api.Assertions.*;

class RatingCalculatorServiceTest {

    private RatingCalculatorService ratingCalculatorService;
    private static Author author;

    @BeforeAll
    static void setup() {
        author = new Author("Jack", "Strong");
    }

    @Test
    void shouldVerifyInteractionWithExternalService() {
//       given
        Book book1 = new Book("title1", author, BookCategory.THRILLER);
        BookRatingService mockedService = Mockito.mock(BookRatingService.class);
        Mockito.when(mockedService.getRating(book1.getTitle(), book1.getAuthor())).thenReturn(7.8);
        RatingCalculatorService ratingWithMock = new RatingCalculatorService(mockedService);
//        when
        Rating result = ratingWithMock.calculateWithExternalService(book1);
//        then
        assertEquals(Rating.EXCELLENT,result);
    }



}