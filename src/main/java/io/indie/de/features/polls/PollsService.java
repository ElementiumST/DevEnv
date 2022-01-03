package io.indie.de.features.polls;

import io.indie.de.features.polls.event.PollsEventHandler;
import io.indie.de.features.polls.repository.ISurveyRepository;
import io.indie.de.features.polls.repository.SurveyRepository;
import io.indie.de.features.polls.storage.IPollsStorageInteractor;
import io.indie.de.features.polls.storage.PollsStorageInteractor;
import io.indie.de.features.util.Utils;
import org.bukkit.Bukkit;

/**
 * Сервис для проведения опросов
 * @author Igor.Stark
 */
public class PollsService implements IPollsService{
    @Override
    public void initialize() {
        IPollsStorageInteractor pollsStorageInteractor = new PollsStorageInteractor();
        ISurveyRepository surveyRepository = new  SurveyRepository(pollsStorageInteractor);
        PollsEventHandler pollsEventHandler = new PollsEventHandler(surveyRepository);

        Utils.getInstance()
                .registerEventHandler(
                        pollsEventHandler
                );
    }

    @Override
    public void disable() {

    }

}
