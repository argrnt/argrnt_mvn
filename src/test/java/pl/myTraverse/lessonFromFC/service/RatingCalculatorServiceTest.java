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
        assertEquals(Rating.EXCELLENT, result);
    }


    @Test
    void shouldVerifyInteractionWithExternalService_2() {
//        given
        Book book1 = new Book("title1", author, BookCategory.THRILLER);
        Book book2 = new Book("title2", author, BookCategory.NOVEL);
        Book book3 = new Book("title3", author, BookCategory.DRAMA);
        Book book4 = new Book("title4", author, BookCategory.COMEDY);
        Book book5 = new Book("title5", author, BookCategory.CRIME_STORY);
        Book[] books = {book1, book2, book3, book4, book5};
        BookRatingService mockedService = Mockito.mock(BookRatingService.class);
        Mockito.when(mockedService.getRating(Mockito.anyString(), Mockito.any(Author.class)))
                .thenReturn(6.4, 1.3, 7.1, 2.6, 5.9);
        RatingCalculatorService ratingWithMock = new RatingCalculatorService(mockedService);
//        when
        Rating rating1 = ratingWithMock.calculateWithExternalService(book1);
        Rating rating2 = ratingWithMock.calculateWithExternalService(book2);
        Rating rating3 = ratingWithMock.calculateWithExternalService(book3);
        Rating rating4 = ratingWithMock.calculateWithExternalService(book4);
        Rating rating5 = ratingWithMock.calculateWithExternalService(book5);
//        then
        assertEquals(Rating.EXCELLENT, rating1);
        assertEquals(Rating.BAD, rating2);
        assertEquals(Rating.EXCELLENT, rating3);
        assertEquals(Rating.AVERAGE, rating4);
        assertEquals(Rating.GOOD, rating5);
        Mockito.verify(mockedService, Mockito.times(5)).getRating(Mockito.anyString(),
                Mockito.any(Author.class));
    }

    @Test
    void shouldVerifyInteractionWithExternalServiceThrowsException() {
//        given
        Book book = new Book("title", author, BookCategory.COMEDY);
        BookRatingService mockitoService = Mockito.mock(BookRatingService.class);
        Mockito.when(mockitoService.getRating(Mockito.any(), Mockito.any()))
                .thenThrow(IllegalStateException.class);
        RatingCalculatorService ratingWithThrowException = new RatingCalculatorService(mockitoService);
//        when
//        then
        Mockito.verify(mockitoService,Mockito.times(0)).getRating(Mockito.any(), Mockito.any());
        assertThrows(IllegalStateException.class,
                () -> ratingWithThrowException.calculateWithExternalService(book));

    }




}