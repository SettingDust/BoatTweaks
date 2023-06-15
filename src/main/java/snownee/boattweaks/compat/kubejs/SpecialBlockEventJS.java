package snownee.boattweaks.compat.kubejs;

import dev.latvian.mods.kubejs.entity.EntityEventJS;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.state.BlockState;

public class SpecialBlockEventJS extends EntityEventJS {
	public final Boat boat;
	public final BlockState blockState;
	public final BlockPos blockPos;

	public SpecialBlockEventJS(Boat boat, BlockState blockState, BlockPos blockPos) {
		this.boat = boat;
		this.blockState = blockState;
		this.blockPos = blockPos;
	}

	@Override
	public Entity getEntity() {
		return boat;
	}
}
