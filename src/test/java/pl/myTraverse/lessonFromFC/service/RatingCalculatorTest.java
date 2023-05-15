package pl.myTraverse.lessonFromFC.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.myTraverse.lessonFromFC.model.Author;
import pl.myTraverse.lessonFromFC.model.Rating;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RatingCalculatorTest {

    private RatingCalculator ratingCalculator;
    private static Author author;

    @BeforeAll
    static void setup() {
        author = new Author("Jack", "Strong");
    }

    @BeforeEach
    void init() {
        ratingCalculator = new RatingCalculator();
    }


    @ParameterizedTest
    @ValueSource(doubles = {-2.4, 0, -3, -0.01})
    void verifyIfRatingUNKNOWN(double averageOpinion) {
//        given, when
        Rating rating = ratingCalculator.calculateRating(averageOpinion);
//        then
        assertEquals(Rating.UNKNOWN, rating);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.2, 0.3, 1.99, 0.01, 1.4})
    void verifyIfRatingBAD(double averageOpinion) {
//        given, when
        Rating rating = ratingCalculator.calculateRating(averageOpinion);
//        then
        assertEquals(Rating.BAD, rating);
    }

    @ParameterizedTest
    @ValueSource(doubles = {2.4, 3.99, 2.93, 2.01})
    void verifyIfRatingAVERAGE(double averageOpinion) {
//        given, when
        Rating rating = ratingCalculator.calculateRating(averageOpinion);
//        then
        assertEquals(Rating.AVERAGE, rating);
    }

    @ParameterizedTest
    @ValueSource(doubles = {4.01, 5.12, 5.993, 4.75})
    void verifyIfRatingGOOD(double averageOpinion) {
//        given, when
        Rating rating = ratingCalculator.calculateRating(averageOpinion);
//        then
        assertEquals(Rating.GOOD, rating);
    }

    @ParameterizedTest
    @ValueSource(doubles = {6.001, 9.26, 8.42, 7.83})
    void verifyIfRatingEXCELLENT(double averageOpinion) {
//        given, when
        Rating rating = ratingCalculator.calculateRating(averageOpinion);
//        then
        assertEquals(Rating.EXCELLENT, rating);
    }





}