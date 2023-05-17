package pl.myTraverse.lessonFromFC.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pl.myTraverse.lessonFromFC.model.BookCategory;

import static org.junit.jupiter.api.Assertions.*;

class AdultsRestrictionVerifierTest {

    private AdultsRestrictionVerifier adultsRestrictionVerifier;

    @BeforeEach
    void init(){
        adultsRestrictionVerifier=new AdultsRestrictionVerifier();
    }


    @ParameterizedTest
    @EnumSource(value = BookCategory.class, names = {"THRILLER", "CRIME_STORY"})
    void shouldVerifyAdultsCategory(BookCategory bookCategory) {
//        given
//        when
        boolean adultOnly = adultsRestrictionVerifier.isAdultOnly(bookCategory);
//        then
        assertTrue(adultOnly);
    }


    @ParameterizedTest
    @EnumSource(value = BookCategory.class, names = {"THRILLER", "CRIME_STORY"}, mode = EnumSource.Mode.EXCLUDE)
    void shouldVerifyAdultsCategory_2(BookCategory bookCategory) {
//        given
//        when
        boolean adultOnly = adultsRestrictionVerifier.isAdultOnly(bookCategory);
//        then
        assertFalse(adultOnly);
    }


}