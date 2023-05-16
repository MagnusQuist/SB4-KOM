package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * This interface is used to define the methods that should be implemented by
 * the classes that are used to process entities.
 */
public interface IEntityProcessingService {
    /**
     * This method is used to process the entities in the game world.
     * @param gameData Contains information about the game world. Such as delta time, display size & input keys
     * @param world Contains references to all entities in the game world.
     */
    void process(GameData gameData, World world);
}
