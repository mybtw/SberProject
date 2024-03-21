package ru.astaf.room_management_service.repositories.custom;

import org.springframework.data.mongodb.core.query.Query;
import ru.astaf.room_management_service.models.Room;

import java.util.List;

public interface CustomRoomRepository {
    List<Room> getRoomsBySearchCriteria(Query query);
}
