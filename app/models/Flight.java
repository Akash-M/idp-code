package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by prate_000 on 16-05-2016.
 */
@Document(collection = "flight")
public class Flight {

    @Id
    private Integer id;

    private Integer requiredNumberOfParkingStations;
    private Integer expectedEndOfBaggageHandling;
    private Integer carousel_id;
    private List<Integer> worker_id;
    private List<Integer> workstations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequiredNumberOfParkingStations() {
        return requiredNumberOfParkingStations;
    }

    public void setRequiredNumberOfParkingStations(int requiredNumberOfParkingStations) {
        this.requiredNumberOfParkingStations = requiredNumberOfParkingStations;
    }

    public Integer getExpectedEndOfBaggageHandling() {
        return expectedEndOfBaggageHandling;
    }

    public void setExpectedEndOfBaggageHandling(Integer expectedEndOfBaggageHandling) {
        this.expectedEndOfBaggageHandling = expectedEndOfBaggageHandling;
    }

    public Integer getCarousel_id() {
        return carousel_id;
    }

    public void setCarousel_id(Integer carousel_id) {
        this.carousel_id = carousel_id;
    }

    public List<Integer> getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(List<Integer> worker_id) {
        this.worker_id = worker_id;
    }

    public List<Integer> getWorkstations() {
        return workstations;
    }

    public void setWorkstations(List<Integer> workstations) {
        this.workstations = workstations;
    }
}
