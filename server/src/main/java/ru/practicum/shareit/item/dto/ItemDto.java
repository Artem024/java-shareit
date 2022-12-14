package ru.practicum.shareit.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.practicum.shareit.booking.dto.BookingDtoForItem;
import ru.practicum.shareit.comment.dto.CommentDtoResponse;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class ItemDto {
    private Long id;
    private String name;
    private String description;
    @JsonProperty("owner")
    private Long ownerId;
    private Boolean available;
    @JsonProperty("requestId")
    private Long requestId;
    private BookingDtoForItem lastBooking;
    private BookingDtoForItem nextBooking;
    private List<CommentDtoResponse> comments;

}
