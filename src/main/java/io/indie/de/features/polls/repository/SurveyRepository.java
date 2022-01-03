package io.indie.de.features.polls.repository;

import io.indie.de.features.polls.model.Survey;
import io.indie.de.features.polls.storage.IPollsStorageInteractor;

import java.util.List;

/**
 * @author Igor.Stark
 */
public class SurveyRepository implements ISurveyRepository{

    private IPollsStorageInteractor pollsStorageInteractor;

    public SurveyRepository(IPollsStorageInteractor pollsStorageInteractor) {
        this.pollsStorageInteractor = pollsStorageInteractor;
    }

    @Override
    public List<Survey> getNotCompletedSurveyForUser(String playerID) {
        return null;
    }

    @Override
    public void markAsUserCompleteSurvey(String playerID) {

    }
}
