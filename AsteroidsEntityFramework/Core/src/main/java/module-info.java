module Core {
    requires Common;
    requires CommonEnemy;
    requires CommonBullet;
    requires CommonAsteroids;
    requires java.desktop;
    requires spring.context;
    requires com.badlogic.gdx;

    uses dk.sdu.mmmi.cbse.common.services.IGamePluginService;
    uses dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
    uses dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;

    exports dk.sdu.mmmi.cbse.components;
    exports dk.sdu.mmmi.cbse.main;
}