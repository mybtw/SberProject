package ru.astaf.room_management_service.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.astaf.room_management_service.models.Room;
import ru.astaf.room_management_service.repositories.custom.CustomRoomRepository;

public interface RoomRepository extends MongoRepository<Room, String>, CustomRoomRepository {
}
