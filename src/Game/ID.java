package Game;

public enum ID {
    // id something as a player or enemy.

    Enemy(),
    Player(),
    Player2();

    /* if we add a Player2 we would have to add a new handler object. If you want to differentiate between the two
       You loop through all the objects and then if you have the id of the player then you can use the actions.
    */
}
