package com.UserService.User.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    public String RatingId;
    public String UserId;
    public String HotelId;
    public int rating;
    public String remark;
}
