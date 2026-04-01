package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture player;
    private Texture enemy;
    private Texture background;
    private float playerY, playerX;
    private float playerSpeed = 200f;
    private float enemyY, enemyX;
    private float enemySpeed = -200f;

    @Override
    public void create() {
        batch = new SpriteBatch();
        player = new Texture("player.png");
        enemy = new Texture("enemy.png");
        background = new Texture("background.jpg");

        playerX= 0;
        playerY=210;

        enemyY = 300;
        enemyX =Gdx.graphics.getWidth() - enemy.getWidth();
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);

        float delta = Gdx.graphics.getDeltaTime();

        playerX += playerSpeed * delta;
        if (playerX <= 0) {
            playerX = 0;
            playerSpeed *= -1;
        } else if (playerX >= Gdx.graphics.getWidth() - player.getWidth()) {
            playerX = Gdx.graphics.getWidth() - player.getWidth();
            playerSpeed *= -1;
        }
        enemyX -= enemySpeed * delta;
        if (enemyX <= 0) {
            enemyX = 0;
            enemySpeed *= -1;
        } else if (enemyX >= Gdx.graphics.getWidth() - enemy.getWidth()) {
            enemyX = Gdx.graphics.getWidth() - enemy.getWidth();
            enemySpeed *= -1;
        }

        batch.begin();
        batch.draw(background, 0 , 0, 1440, 960);
        batch.draw(player, playerX, playerY);
        batch.draw(enemy,enemyX, enemyY);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        player.dispose();
        enemy.dispose();
        background.dispose();
    }
}
