package io.indie.de.features.polls.storage;

import io.indie.de.features.polls.model.Survey;

import java.util.List;

/**
 * @author Igor.Stark
 */
public interface IPollsStorageInteractor {

    List<Survey> getActiveSurveyPool();

    void createSurvey(Survey survey);

    void disableSurvey(Survey survey);
}
