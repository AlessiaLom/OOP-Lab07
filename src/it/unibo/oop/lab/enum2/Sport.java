/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
    
    BASKET(Place.INDOOR, 5, "basket"),
    VOLLEY(Place.INDOOR, 6, "volley"),
    TENNIS(Place.OUTDOOR, 1, "tennis"),
    BIKE(Place.OUTDOOR, 1, "bike"),
    F1(Place.OUTDOOR, 1, "Formula1"),
    MOTOGP(Place.OUTDOOR, 1, "motoGP"),
    SOCCER(Place.OUTDOOR, 11, "soccer");

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
    private final int teamMembers;
    private final String name;
    private final Place place;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     */
     Sport(final Place place, final int noTeamMembers, final String actualName){
         this.teamMembers = noTeamMembers;
         this.place=place;
         this.name=actualName;
     }
     

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     */ 
     public boolean isIndividualSport() {
         return this.teamMembers==1;
     }
     /* 
     * Must return true only if called on individual sports
     * 
     */ 
     public boolean isIndoorSport() {
         return this.place.equals(Place.INDOOR);
     }
     /* 
     * Must return true in case the sport is practices indoor
     * 
     */ 
     public Place getPlace() {
         return this.place;
     }
     /* 
     * Must return the place where this sport is practiced
     * 
     */ 
     public String toString() {
         return "SPORT: " + this.name + 
                 "; Team Members: " + this.teamMembers + 
                 "; Place: " + this.place;
     }
     /* 
     * Returns the string representation of a sport
     */
}
