// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.
package plugin;

// Import libraries.
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import uk.hotten.gxui.GUIBase;
import uk.hotten.gxui.GUIButton;
import uk.hotten.gxui.GUIItem;

public class SpectatorGui extends GUIBase {

	private Player assignedPlayer;

	public SpectatorGui(JavaPlugin plugin, Player player) {

		super(plugin, player, "&3&lTest GUI", 9, true);

		assignedPlayer = player;

	}

	@Override
	public void setupItems() {

		int curr = 0;
		GUIItem item = null;
		List<String> name = new ArrayList<String>(18);

		for (Player p : Bukkit.getOnlinePlayers()) {

			// Add a new element to the list for each player.
			name.add("&eTeleport to: &d&l" + p.getName());

		}

		for (Player p : Bukkit.getOnlinePlayers()) {

			item = new GUIItem(Material.PLAYER_HEAD, 1, name.get(curr), p.getName());
			GUIButton guibutton = new GUIButton() {

				@Override
				public boolean leftClick() {

					assignedPlayer.closeInventory();
					assignedPlayer.teleport(p);

					return true;

				}

				@Override public boolean leftClickShift() { return false; }
				@Override public boolean rightClick() { return false; }
				@Override public boolean rightClickShift() { return false; }

			};

			item.button(guibutton);

			addItem(curr, item);
			curr = nextCurr(curr);

		}

	}

	private int nextCurr(int curr) {

		if (curr == 3) {

			return 6;

		}
		else {

			return (curr += 1);

		}

	}

	public static ArrayList<TextComponent> convertToTextComponents(List<String> stringList) {

		ArrayList<TextComponent> textComponents = new ArrayList<TextComponent>(18);
		for (String str : stringList) {

			TextComponent textComponent = LegacyComponentSerializer.legacyAmpersand().deserialize(str);
			textComponents.add(textComponent);

		}

		return textComponents;

	}

}