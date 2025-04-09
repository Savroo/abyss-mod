package net.savro.abyss.block.custom;

import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class OmanekoBlock extends Block {
  public OmanekoBlock(Settings settings) {
    super(settings);
  }

  @Override
  protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
    BlockHitResult hit) {

      world.playSound(player, pos, SoundEvents.ENTITY_CAT_AMBIENT, SoundCategory.BLOCKS, 1.0F, 1.0F);
      return ActionResult.SUCCESS;
    }

  // Add any additional methods or properties specific to the OmanekoBlock here
}
