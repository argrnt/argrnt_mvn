package pl.myTraverse.lessonFromFC.service;

import pl.myTraverse.lessonFromFC.model.BookCategory;

public class AdultsRestrictionVerifier {


    public boolean isAdultOnly(BookCategory bookCategory) {
        return bookCategory == BookCategory.THRILLER || bookCategory == BookCategory.CRIME_STORY;
    }

}
