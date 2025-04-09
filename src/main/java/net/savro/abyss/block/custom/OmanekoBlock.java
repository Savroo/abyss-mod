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

import net.savro.abyss.sound.ModSounds; // Import your custom sound event class



import net.savro.abyss.Abyss;

public class OmanekoBlock extends Block {
  public OmanekoBlock(Settings settings) {
    super(settings);
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
    BlockHitResult hit) {

      world.playSound(null, pos, ModSounds.OMNI , SoundCategory.BLOCKS);
      player.kill();
      return ActionResult.SUCCESS;
    }

  // Add any additional methods or properties specific to the OmanekoBlock here
}
