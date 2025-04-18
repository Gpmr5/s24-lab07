package frogger;

// A record class to conveniently store immutable data for a frogger's information.
public record FroggerID(String firstName,
                         String lastName,
                         String phoneNumber,
                         String zipCode,
                         String state,
                         String gender) {
}
