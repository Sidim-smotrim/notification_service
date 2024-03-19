package faang.school.notificationservice.client;

import faang.school.notificationservice.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(path = "/api/users", name = "user-service", url = "${user-service.host}:${user-service.port}")
public interface UserServiceClient {

    @GetMapping("{id}")
    UserDto getUser(@PathVariable long id);

    @GetMapping("{userId}")
    boolean isUserExists(@PathVariable long userId);
}
