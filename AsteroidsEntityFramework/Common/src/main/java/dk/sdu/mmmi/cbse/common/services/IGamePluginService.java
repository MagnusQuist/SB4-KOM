package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * This interface is used to define modules that should be
 * loaded into the game.
 */
public interface IGamePluginService {

    /**
     * This method is called when the module is loaded into the game.
     * @param gameData Contains information about the game world. Such as delta time, display size & input keys
     * @param world Contains references to all entities in the game world.
     */
    void start(GameData gameData, World world);

    /**
     * This method is called when the module is unloaded from the game.
     * @param gameData Contains information about the game world. Such as delta time, display size & input keys
     * @param world Contains references to all entities in the game world.
     */
    void stop(GameData gameData, World world);
}
