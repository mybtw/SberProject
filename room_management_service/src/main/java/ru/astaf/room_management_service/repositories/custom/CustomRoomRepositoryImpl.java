package ru.astaf.room_management_service.repositories.custom;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ru.astaf.room_management_service.models.Room;

import java.util.List;

@Repository
public class CustomRoomRepositoryImpl implements CustomRoomRepository {
    private MongoTemplate mongotemplate;

    @Autowired
    public CustomRoomRepositoryImpl(MongoTemplate mongotemplate) {
        this.mongotemplate = mongotemplate;
    }

    @Override
    public List<Room> getRoomsBySearchCriteria(Query query) {
        return mongotemplate.find(query, Room.class);
    }
}
