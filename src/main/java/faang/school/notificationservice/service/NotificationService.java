package faang.school.notificationservice.service;

import faang.school.notificationservice.dto.PreferredContact;
import faang.school.notificationservice.dto.UserDto;

public interface NotificationService {
    void send(UserDto user, String message);
    PreferredContact getPreferredContact();

}
