package ru.astaf.room_management_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoomResponse {
    private String id;
    private String name;
    private String address;
    private int capacity;
    private boolean hasMonitorOrTV;
    private boolean hasVideoConferencing;
}
