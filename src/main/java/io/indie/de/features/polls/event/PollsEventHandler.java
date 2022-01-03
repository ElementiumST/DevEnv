package io.indie.de.features.polls.event;

import io.indie.de.features.polls.model.Survey;
import io.indie.de.features.polls.repository.ISurveyRepository;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.List;

/**
 * @author Igor.Stark
 */
public class PollsEventHandler implements Listener {

    private ISurveyRepository surveyRepository;

    public PollsEventHandler(ISurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @EventHandler
    private void onPlayerJoinEventListened(PlayerJoinEvent event) {
        List<Survey> polls = surveyRepository.getNotCompletedSurveyForUser(event.getPlayer().getUniqueId().toString());
        if (!polls.isEmpty()) {

        }
    }
}
