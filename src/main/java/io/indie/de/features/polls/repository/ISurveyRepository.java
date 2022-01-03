package io.indie.de.features.polls.repository;

import io.indie.de.features.polls.model.Survey;

import java.util.List;

/**
 * @author Igor.Stark
 */
public interface ISurveyRepository {
    List<Survey> getNotCompletedSurveyForUser(String playerID);
    void markAsUserCompleteSurvey(String playerID);
}
