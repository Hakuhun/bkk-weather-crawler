package hu.oe.bakonyi.bkk.bkkcrawler.businesslogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private double lat;
    private double lng;
}