package dk.sdu.mmmi.cbse.playersystem;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PlayerPluginTest {
    // Mock data
    @Mock
    private static GameData gameData;
    @Mock
    private static World world;
    private static PlayerPlugin playerPlugin;

    @BeforeAll
    public static void setUpClass() {
        gameData = mock(GameData.class);
        world = mock(World.class);

        playerPlugin = new PlayerPlugin();
    }

    @Test
    @Order(1)
    public void testStart() {
        playerPlugin.start(gameData, world);
        verify(world).addEntity(any(Player.class));
    }

    @Test
    @Order(2)
    public void testStop() {
        playerPlugin.stop(gameData, world);
        verify(world).removeEntity(any(Player.class));
    }
}
