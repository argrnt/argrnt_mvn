package pl.myTraverse.lessonFromFC.service;

import pl.myTraverse.lessonFromFC.model.Rating;

public class RatingCalculator {


    public Rating calculateRating(double averageOpinion) {
        if (averageOpinion > 0 && averageOpinion <= 2) {
            return Rating.BAD;
        }
        if (averageOpinion > 2 && averageOpinion <= 4) {
            return Rating.AVERAGE;
        }
        if (averageOpinion > 4 && averageOpinion <= 6) {
            return Rating.GOOD;
        }
        if (averageOpinion > 6) {
            return Rating.EXCELLENT;
        }
        return Rating.UNKNOWN;
    }


}
