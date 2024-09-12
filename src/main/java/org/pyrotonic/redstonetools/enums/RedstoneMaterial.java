package org.pyrotonic.redstonetools.enums;

import net.minecraft.block.Block;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum RedstoneMaterial implements ToolMaterial {
    REDSTONE(
            276,
            15,
            8.0F,
            0.0F,
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            Ingredient.ofItems(Items.REDSTONE)
    );


    private final int durability, enchantability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final Ingredient repairIngredient;

    RedstoneMaterial(int durability, int enchantability, float miningSpeedMultiplier, float attackDamage, TagKey inverseTag, Ingredient repairIngredient) {
        this.durability = durability;
        this.enchantability = enchantability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public ToolComponent createComponent(TagKey<Block> tag) {
        return ToolMaterial.super.createComponent(tag);
    }
}
