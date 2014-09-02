package ch.filecloud.queuemonitor.web.api.topic;

import ch.filecloud.queuemonitor.domain.TopicInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by domi on 8/5/14.
 */
public class    TopicInfoResponseDTO {

    public static final String TOPICS = "topics";
    private List<TopicInfo> topicInfos;

    public TopicInfoResponseDTO(List<TopicInfo> topicInfos) {
        this.topicInfos = topicInfos;
    }

    @JsonProperty(TOPICS)
    public List<TopicInfo> getTopicInfos() {
        return topicInfos;
    }
}
