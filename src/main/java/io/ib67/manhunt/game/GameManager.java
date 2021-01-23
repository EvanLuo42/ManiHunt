package io.ib67.manhunt.game;

import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Optional;

public interface GameManager {
    JoinResult join(Player player);

    JoinResult join(String gameId, Player player);

    Optional<Game> gameOf(Player player);

    Map<String, Game> getGames();

    @AllArgsConstructor
    class JoinResult {
        public Game game;
        private final boolean succeed;

        public boolean isSucceed() {
            return succeed;
        }

        public boolean isGameStarted() {
            return game.isStarted();
        }
    }
}